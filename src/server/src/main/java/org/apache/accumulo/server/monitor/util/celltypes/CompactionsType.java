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
package org.apache.accumulo.server.monitor.util.celltypes;

import org.apache.accumulo.core.master.thrift.Compacting;
import org.apache.accumulo.core.master.thrift.TableInfo;

public class CompactionsType extends CellType<TableInfo> {
  
  private String fieldName;
  
  public CompactionsType(String which) {
    this.fieldName = which;
  }
  
  @Override
  public String format(Object obj) {
    if (obj == null)
      return "-";
    TableInfo summary = (TableInfo) obj;
    Compacting c = summary.major;
    if (fieldName.equals("minor"))
      c = summary.minor;
    if (c == null)
      c = new Compacting();
    return String.format("%s&nbsp;(%,d)", NumberType.commas(c.running, c.queued == 0 ? 0 : 1, summary.onlineTablets), c.queued);
  }
  
  @Override
  public int compare(TableInfo o1, TableInfo o2) {
    Compacting c1 = o1.major;
    Compacting c2 = o2.major;
    if (fieldName.equals("minor")) {
      c1 = o1.minor;
      c2 = o2.minor;
    }
    return c1.running + c1.queued - c2.running - c2.queued;
  }
  
  @Override
  public String alignment() {
    return "right";
  }
  
}
