package com.shine.spring.jdbc.datasource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * <p>Description: Spring jdbc 测试类 </p>
 * <p>Company: 上海天坊信息科技有限公司</p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/26 下午5:23
 */
public class DataSourceTest {

    @Test
    public void testDataSource() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /**
         * 面向接口编程
         *
         * JDBC属于模板模式
         * 模板模式:固定的代码+可变的参数
         */
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);
    }
}
