package com.shine.spring.jdbc.transaction;

import com.shine.spring.jdbc.transaction.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Description: spring 事务配置 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/27 下午1:56
 */
public class PersonServiceTest {

    @Test
    public void testPersonServcie(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService= (PersonService) context.getBean("personService");
        personService.savePerson("insert into person(name) values('wangxiang-service')");
    }
}
