package com.fiberhome.imc.Test.service.imp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.fiberhome.imc.Test.service.Operation;

@Service
public class OperationImp implements Operation{
	 @Autowired
	 @Qualifier("d1")
	    private JdbcTemplate jdbcTemplate;
	 
	 @Autowired
	 @Qualifier("d2")
	    private JdbcTemplate d;

	@Override
	public void add(String name, String pd) {
//		DataSource dataSource=new da
//		BasicDataSource  dataSource = new BasicDataSource ();
//        dataSource.setUrl(env.getProperty("spring.datasource.url"));
//        dataSource.setUsername(env.getProperty("spring.datasource.username"));//用户名
//        dataSource.setPassword(env.getProperty("spring.datasource.password"));//密码
//        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		// TODO Auto-generated method stub
//		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		System.err.println(jdbcTemplate);
		jdbcTemplate.update("insert into name(name, pd) values(?, ?)", name, pd);
		d.update("insert into name(name, pd) values(?, ?)", name, pd);
	}

	@Override
	public void delt(String name) {
		// TODO Auto-generated method stub
		
	}

}
