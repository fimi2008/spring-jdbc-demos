package com.shine.spring.jdbc.transaction.service.impl;

import com.shine.spring.jdbc.transaction.dao.PersonDao;
import com.shine.spring.jdbc.transaction.service.PersonService;

/**
 * <p>Description: TODO </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/27 下午1:42
 */
public class PersonServiceImpl implements PersonService {
    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void savePerson(String sql) {
        this.personDao.savePerson(sql);
        //nt a = 1/0; // 模拟异常
        this.personDao.savePerson(sql);
    }
}
