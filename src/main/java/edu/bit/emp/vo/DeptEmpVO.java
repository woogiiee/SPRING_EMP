package edu.bit.emp.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
			//클래스 이름도 1:N관계면 1이 앞에 오게끔
public class DeptEmpVO {
	int deptno; //  NOT NULL NUMBER(2)
	String dname;// VARCHAR2(14) 
	String loc;//   VARCHAR2(13)
	
	List<EmpVO> empList;
}
