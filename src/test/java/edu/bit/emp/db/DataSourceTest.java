package edu.bit.emp.db;

import static org.junit.Assert.*;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.bit.emp.service.EmpService;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)//�̰� ��ü�����ε� IOC�����̳ʸ� ������ش�. Ioc�ȿ� �ؿ� �ִ� ���� �־��ش�.
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class DataSourceTest {
	
	
	@Inject
	DataSource datasource;
	
	@Inject
	EmpService empService;

	@Test
	public void testDataSource() {
		
		log.info(datasource);
	
	}
	
	@Test
	public void testEmpService() {
		
		log.info(empService.empList());
		System.out.println(empService.empList());
	
	}

}
