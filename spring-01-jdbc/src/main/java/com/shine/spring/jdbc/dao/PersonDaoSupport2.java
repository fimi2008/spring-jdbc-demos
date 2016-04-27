package com.shine.spring.jdbc.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * <p>Description: TODO </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/27 下午9:27
 */
public class PersonDaoSupport2 {
    private JdbcDaoSupport jdbcDaoSupport;

    public void setJdbcDaoSupport(JdbcDaoSupport jdbcDaoSupport) {
        this.jdbcDaoSupport = jdbcDaoSupport;
    }

    public void execute(String sql){
        jdbcDaoSupport.getJdbcTemplate().execute(sql);
    }
}
