package com.shine.dao;

import com.shine.dbtemplate.DBTemplate;

import javax.sql.DataSource;

/**
 * <p>Description:  </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/27 上午9:49
 */
public class PersonDaoImpl extends DBTemplate {

    public PersonDaoImpl(DataSource dataSource) {
        super(dataSource);
    }

    public PersonDaoImpl() {
    }
}
