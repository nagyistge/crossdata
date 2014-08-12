/*
 * Licensed to STRATIO (C) under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  The STRATIO (C) licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.stratio.meta2.metadata;

public class ColumnMetadata implements IMetadata {
  private final String catalog;
  private final String table;
  private final String name;
  private final Object[] parameters;
  private final ColumnType columnType;

  public ColumnMetadata(String catalog, String table, String name, Object[] parameters,
      ColumnType columnType) {
    this.catalog = catalog;
    this.table = table;
    this.name = name;
    this.parameters = parameters;
    this.columnType = columnType;
  }



  public String getName() {
    return name;
  }

  public Object[] getParameters() {
    return parameters;
  }

  public ColumnType getColumnType() {
    return columnType;
  }

  public String getTable() {
    return table;
  }



  @Override public String getQualifiedName() {
    return QualifiedNames.getColumnQualifiedName(catalog,table,name);
  }
}
