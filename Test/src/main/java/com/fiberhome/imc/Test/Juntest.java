package com.fiberhome.imc.Test;
import com.fiberhome.imc.Test.App;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fiberhome.imc.Test.service.Operation;
import com.fiberhome.imc.Test.service.imp.OperationImp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=App.class)
@WebAppConfiguration
public class Juntest {
	@Autowired
	private OperationImp op;
	
//	@Autowired
//	//@Qualifier("postgresDB")  
//	private DataSource postgresDataSource;
//	@Autowired
//	@org.springframework.beans.factory.annotation.Qualifier("postgresDB")
//	private DataSource p;
	
	
	@Test
	public void a(){
//		Operation op=new OperationImp();
		System.out.println("jung");
		System.err.println(op);
//		System.out.println(postgresDataSource);
//		System.out.println(p);
		op.add("123", "123");
		
	}

}
