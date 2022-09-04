package com.mycompany.capp.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author aman
 */

@Configuration
//@ComponentScan(basePackages = "com.mycompany")
public class SpringRootConfig {
//    add DAO (data access object),services,datasources sende (email; messages),etc.
    @Bean
    public BasicDataSource getDataSource(){
        BasicDataSource ds=new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/contact");
        ds.setUsername("root");
        ds.setPassword("");
        ds.setMaxTotal(2);
        ds.setInitialSize(1);
        ds.setTestOnBorrow(true);
        ds.setValidationQuery("SELECT 1");
        ds.setDefaultAutoCommit(true);
        return ds;
    }
}
