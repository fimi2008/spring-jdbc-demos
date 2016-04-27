package com.shine.spring.jdbc.datasource;

import com.shine.dao.PersonDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Description: TODO </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/27 上午9:52
 */
public class PersonDaoTest {

    @Test
    public void testPersonDao(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDaoImpl personDao = (PersonDaoImpl)context.getBean("personDao");
        personDao.insert("insert into person(name) values('wangxiang')");
        PersonDaoImpl personDao2 = (PersonDaoImpl)context.getBean("personDao2");
        personDao2.insert("insert into person(name) values('wangxiang2')");
        PersonDaoImpl personDao3 = (PersonDaoImpl)context.getBean("personDao3");
        personDao3.insert("insert into person(name) values('wangxiang3')");
    }
}
