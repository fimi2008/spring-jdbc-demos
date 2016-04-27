package com.shine.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * <p>Description: JdbcTemplate作为属性存在 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/27 上午11:49
 */
public class PersonTempDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void execute(String sql){
        this.jdbcTemplate.execute(sql);
    }
}
