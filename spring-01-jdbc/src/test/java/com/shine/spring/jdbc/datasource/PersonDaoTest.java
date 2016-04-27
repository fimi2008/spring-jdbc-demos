package com.shine.spring.jdbc.datasource;

import com.shine.dao.PersonDaoImpl;
import com.shine.spring.jdbc.dao.PersonDao;
import com.shine.spring.jdbc.dao.PersonDaoSupport;
import com.shine.spring.jdbc.dao.PersonDaoSupport2;
import com.shine.spring.jdbc.dao.PersonTempDao;
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

    /**
     * personDao 继承JdbcTemplate 实现
     */
    @Test
    public void testJdbcPersonDao(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDao personDao4 = (PersonDao)context.getBean("personDao4");
        personDao4.execute("insert into person(name) values('wangxiang-jdbc1')");
        PersonDao personDao5 = (PersonDao)context.getBean("personDao5");
        personDao5.execute("insert into person(name) values('wangxiang-jdbc2')");
    }

    /**
     * personTempDao 将JdbcTemplate 作为属性实现
     */
    @Test
    public void testPersonTempDao(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonTempDao personTempDao1 = (PersonTempDao) context.getBean("personTempDao1");
        personTempDao1.execute("insert into person(name) values('wangxiang-temp1')");
        PersonTempDao personTempDao2 = (PersonTempDao) context.getBean("personTempDao2");
        personTempDao2.execute("insert into person(name) values('wangxiang-temp2')");
    }

    /**
     * personDaoSupport 继承 JdbcDaoSupport
     */
    @Test
    public void testPersonDaoSupport(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDaoSupport personDaoSupport = (PersonDaoSupport)context.getBean("personDaoSupport");
        personDaoSupport.execute("insert into person(name) values('wangxiang-support')");
    }

    /**
     * JdbcDaoSupport 作为 personDaoSupport2 属性
     */
    @Test
    public void testPersonDaoSupport2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDaoSupport2 personDaoSupport2 = (PersonDaoSupport2) context.getBean("personDaoSupport2");
        personDaoSupport2.execute("insert into person(name) values('wangxiang-support22')");
    }
}
