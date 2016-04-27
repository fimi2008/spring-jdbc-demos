package com.shine.spring.jdbc.transaction.dao.impl;

import com.shine.spring.jdbc.transaction.dao.PersonDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * <p>Description: TODO </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/27 下午1:37
 */
public class PersonDaoImpl extends JdbcDaoSupport implements PersonDao{

    @Override
    public void savePerson(String sql){
        this.getJdbcTemplate().execute(sql);
    }
}
