/**
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.jdbc.unsupported;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dangdang.ddframe.rdb.integrate.db.AbstractShardingDataBasesOnlyDBUnitTest;
import com.dangdang.ddframe.rdb.sharding.api.ShardingDataSource;
import com.dangdang.ddframe.rdb.sharding.jdbc.ShardingConnection;

public final class UnsupportedOperationStatementTest extends AbstractShardingDataBasesOnlyDBUnitTest {
    
    private ShardingDataSource shardingDataSource;
    
    private ShardingConnection shardingConnection;
    
    private Statement actual;
    
    @Before
    public void init() throws SQLException {
        shardingDataSource = getShardingDataSource();
        shardingConnection = shardingDataSource.getConnection();
        actual = shardingConnection.createStatement();
    }
    
    @After
    public void close() throws SQLException {
        actual.close();
        shardingConnection.close();
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertGetMaxFieldSize() throws SQLException {
        actual.getMaxFieldSize();
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertSetMaxFieldSize() throws SQLException {
        actual.setMaxFieldSize(0);
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertGetMaxRows() throws SQLException {
        actual.getMaxRows();
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertSetMaxRows() throws SQLException {
        actual.setMaxRows(0);
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertGetQueryTimeout() throws SQLException {
        actual.getQueryTimeout();
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertSetQueryTimeout() throws SQLException {
        actual.setQueryTimeout(0);
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertGetFetchDirection() throws SQLException {
        actual.getFetchDirection();
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertSetFetchDirection() throws SQLException {
        actual.setFetchDirection(0);
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertGetGeneratedKeys() throws SQLException {
        actual.getGeneratedKeys();
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertAddBatch() throws SQLException {
        actual.addBatch("");
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertClearBatch() throws SQLException {
        actual.clearBatch();
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertExecuteBatch() throws SQLException {
        actual.executeBatch();
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertCloseOnCompletion() throws SQLException {
        actual.closeOnCompletion();
    }
    
    @Test(expected = SQLFeatureNotSupportedException.class)
    public void assertIsCloseOnCompletion() throws SQLException {
        actual.isCloseOnCompletion();
    }
}
