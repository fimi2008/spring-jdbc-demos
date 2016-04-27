package com.shine.dbtemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>Description: 数据库连接模板类
 * 模仿JdbcTemplate
 * </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/27 上午9:25
 */
public class DBTemplate {
    private DataSource dataSource;

    public DBTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public DBTemplate(){}

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void insert(String sql){
        try {
            Connection connection = this.dataSource.getConnection();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
