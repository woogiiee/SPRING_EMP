package edu.bit.emp.vo;

import java.sql.Timestamp;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;


@NoArgsConstructor
@AllArgsConstructor
@Log4j
@Data //tostring���� ������� �����ֱ� ������ Test�� �ּҰ��� �ƴ϶� ������� ��µȴ�.

public class EmpVO {
	private int empno; //EMPNO    NOT NULL NUMBER(4)    
	private String ename; //ENAME             VARCHAR2(10) 
	private String job; //JOB               VARCHAR2(9)  
	private int mgr; //MGR               NUMBER(4)    
	private Timestamp hiredate; //HIREDATE          DATE         
	private int sal; //SAL               NUMBER(7,2)  
	private int comm; //COMM              NUMBER(7,2)  
	private int deptno; //DEPTNO            NUMBER(2)  
	private int photo;
	
	public int getPhoto() {
		Random r = new Random();
		return r.nextInt(5)+1;
	}
	
	
	
}
