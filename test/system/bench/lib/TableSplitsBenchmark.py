import unittest

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

import subprocess
import os
import glob
import random
import time

from lib import cloudshell, runner, path
from lib.Benchmark import Benchmark
from lib.slaves import runEach, slaveNames
from lib.path import accumulo, accumuloJar
from lib.util import sleep
from lib.options import log

class TableSplitsBenchmark(Benchmark):
    "Creating a table with predefined splits and then deletes it"

    splitsfile = 'slowsplits'
    tablename = 'test_splits'

    def setUp(self): 
        random.jumpahead(int(time.time()))
        num = random.randint(1, 100000)
        self.tablename = self.tablename + "_" + str(num)     
        # Need to generate a splits file for each speed
        #code, out, err = cloudshell.run(self.username, self.password, 'table %s\n' % self.tablename)
        #if out.find('no such table') == -1:
        #    log.debug('Deleting table %s' % self.tablename)
        #    code, out, err = cloudshell.run('user %s\n%s\ndeletetable %s\n' % (self.user, 
        #                                                                          self.password, 
        #                                                                          self.tablename))
        #    self.sleep(5)
        Benchmark.setUp(self)

    def runTest(self):             
        command = 'createtable %s -sf %s\n' % (self.tablename, self.splitsfile)
        log.debug("Running Command %r", command)
        code, out, err = cloudshell.run(self.username, self.password, command)
        return code, out, err

    def shortDescription(self):
        return 'Creates a table with splits. Lower score is better.'
        
    def tearDown(self):
        Benchmark.tearDown(self)
        # self.sleep(5)
        # command = 'deletetable test_splits\n'
        # log.debug("Running Command %r", command)
        # code, out, err = cloudshell.run(self.username, self.password, command)
        # log.debug("Process finished")        

    def setSpeed(self, speed):
        dir = os.path.dirname(os.path.realpath(__file__))
        if speed == "slow":
            splitsfile = 'slowsplits'
        elif speed == "medium":
            splitsfile = 'mediumsplits'
        else: # speed == "fast"
            splitsfile = 'fastsplits'
        self.splitsfile = os.path.join( dir, splitsfile)
        
    def needsAuthentication(self):
        return 1
        
