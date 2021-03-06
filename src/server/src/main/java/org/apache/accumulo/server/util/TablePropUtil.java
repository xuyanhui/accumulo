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
package org.apache.accumulo.server.util;

import org.apache.accumulo.core.Constants;
import org.apache.accumulo.core.client.impl.HdfsZooInstance;
import org.apache.accumulo.core.conf.Property;
import org.apache.accumulo.core.zookeeper.ZooSession;
import org.apache.accumulo.core.zookeeper.ZooUtil;
import org.apache.accumulo.core.zookeeper.ZooUtil.NodeExistsPolicy;
import org.apache.zookeeper.KeeperException;

public class TablePropUtil {
  public static boolean setTableProperty(String tableId, String property, String value) throws KeeperException, InterruptedException {
    Property p = Property.getPropertyByKey(property);
    if ((p != null && !p.getType().isValidFormat(value)) || !Property.isValidTablePropertyKey(property))
      return false;
    
    // create the zk node for per-table properties for this table if it doesn't already exist
    String zkTablePath = getTablePath(tableId);
    ZooUtil.putPersistentData(zkTablePath, new byte[0], NodeExistsPolicy.SKIP);
    
    // create the zk node for this property and set it's data to the specified value
    String zPath = zkTablePath + "/" + property;
    ZooUtil.putPersistentData(zPath, value.getBytes(), NodeExistsPolicy.OVERWRITE);
    
    return true;
  }
  
  public static void removeTableProperty(String tableId, String property) throws InterruptedException, KeeperException {
    String zPath = getTablePath(tableId) + "/" + property;
    ZooSession.getSession().delete(zPath, -1);
  }
  
  private static String getTablePath(String tablename) {
    return ZooUtil.getRoot(HdfsZooInstance.getInstance()) + Constants.ZTABLES + "/" + tablename + Constants.ZTABLE_CONF;
  }
}
