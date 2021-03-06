/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.core.integrate.type.sharding;

import io.shardingsphere.core.constant.DatabaseType;
import io.shardingsphere.core.constant.SQLType;
import io.shardingsphere.core.integrate.jaxb.SQLShardingRule;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NullableShardingTableOnlyDMLAndDDLTest extends AbstractNullableShardingTableOnlyTest {
    
    public NullableShardingTableOnlyDMLAndDDLTest(final String testCaseName, final String sql, final DatabaseType type, final List<SQLShardingRule> sqlShardingRules) {
        super(testCaseName, sql, type, sqlShardingRules);
    }
    
    @Parameterized.Parameters(name = "{0}In{2}")
    public static Collection<Object[]> dataParameters() {
        return dataParameters(SQLType.DML, SQLType.DDL);
    }
    
    @Before
    public void cleanAndInitTable() throws Exception {
        importDataSet();
    }
}
