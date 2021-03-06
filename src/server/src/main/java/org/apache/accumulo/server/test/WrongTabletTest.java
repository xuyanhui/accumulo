/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo.server.test;

import org.apache.accumulo.core.client.impl.HdfsZooInstance;
import org.apache.accumulo.core.conf.AccumuloConfiguration;
import org.apache.accumulo.core.data.KeyExtent;
import org.apache.accumulo.core.data.Mutation;
import org.apache.accumulo.core.security.thrift.AuthInfo;
import org.apache.accumulo.core.tabletserver.thrift.TabletClientService;
import org.apache.accumulo.core.util.ThriftUtil;
import org.apache.hadoop.io.Text;

public class WrongTabletTest {
  private static AuthInfo rootCredentials = new AuthInfo("root", "secret".getBytes(), HdfsZooInstance.getInstance().getInstanceID());
  
  public static void main(String[] args) {
    String location = args[0];
    try {
      TabletClientService.Iface client = ThriftUtil.getTServerClient(location, AccumuloConfiguration.getSystemConfiguration());
      
      Mutation mutation = new Mutation(new Text("row_0003750001"));
      // mutation.set(new Text("colf:colq"), new Value("val".getBytes()));
      mutation.putDelete(new Text("colf"), new Text("colq"));
      client.update(null, rootCredentials, new KeyExtent(new Text("test_ingest"), null, new Text("row_0003750000")).toThrift(), mutation.toThrift());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
