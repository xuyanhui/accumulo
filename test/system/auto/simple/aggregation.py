import os

# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import logging
import unittest
import time

from TestUtils import TestUtilsMixin

log = logging.getLogger('test.auto')

class AggregationTest(TestUtilsMixin, unittest.TestCase):
    "Start a clean accumulo, use an aggregator, verify the data is aggregated"

    order = 25

    def checkSum(self):
        # check the scan
        out, err, code = self.shell(self.masterHost(),"table test\nscan\n")
        for line in out.split('\n'):
            if line.find('row1') == 0:
                self.assert_(int(line.split()[-1]) == sum(range(10)))
                break
        else:
            self.fail("Unable to find needed output in %r" % out)
        
    def runTest(self):

        # initialize the database
        aggregator = 'org.apache.accumulo.core.iterators.aggregation.StringSummation'
        cmd = 'createtable test -a cf=' + aggregator
        out, err, code = self.rootShell(self.masterHost(),"%s\n" % cmd)

        # insert some rows
        log.info("Starting Test Ingester")
        cmd = 'table test\n';
        for i in range(10):
            cmd += 'insert row1 cf col1 %d\n' % i
        out, err, code = self.rootShell(self.masterHost(), cmd)
        self.checkSum()
        self.shutdown_accumulo()
        self.start_accumulo()
        self.checkSum()

def suite():
    result = unittest.TestSuite()
    result.addTest(AggregationTest())
    return result
