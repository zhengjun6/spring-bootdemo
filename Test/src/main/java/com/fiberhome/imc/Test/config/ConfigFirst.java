package com.fiberhome.imc.Test.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 初始化各个数据源的配置
 * @author Administrator
 *
 */

@Configuration  
public class ConfigFirst {

	@Bean(name = "mysqlDB")  
    @Primary  
    @ConfigurationProperties(prefix = "spring.datasource.ds1")  
    public DataSource mysqlDataSource() {  
        return DataSourceBuilder.create().build();  
    }  
  
    @Bean(name = "postgresDB")  
    @ConfigurationProperties(prefix = "spring.datasource.ds2")  
    public DataSource postgresDataSource() {  
        return  DataSourceBuilder.create().build();  
    }  
  
    
    @Bean(name="d1")
    public JdbcTemplate datasource1(@org.springframework.beans.factory.annotation.Qualifier("mysqlDB") DataSource dataSource){
    	
        return new JdbcTemplate(dataSource);
    }
    
    @Bean(name="d2")
    public JdbcTemplate datasource2(@org.springframework.beans.factory.annotation.Qualifier("postgresDB") DataSource dataSource){
    	
        return new JdbcTemplate(dataSource);
    }
    
    
//    @Bean(name = "oracleDB")  
//    @ConfigurationProperties(prefix = "ds_oracle")  
//    public DataSource oracleDataSource() {  
//        return  DataSourceBuilder.create().build();  
//    }  
}
