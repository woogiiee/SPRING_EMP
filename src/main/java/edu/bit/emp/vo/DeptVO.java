package edu.bit.emp.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class DeptVO {
	int deptno; //  NOT NULL NUMBER(2)
	String dname;// VARCHAR2(14) 
	String loc;//   VARCHAR2(13)
	
}
