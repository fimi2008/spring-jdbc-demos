package com.shine.spring.jdbc.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * <p>Description: 继承于JdbcDaoSupport 实现 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/27 上午11:59
 */
public class PersonDaoSupport extends JdbcDaoSupport {

    public void execute(String sql){
        super.getJdbcTemplate().execute(sql);
    }
}
