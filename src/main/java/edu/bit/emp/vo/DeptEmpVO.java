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
			//Ŭ���� �̸��� 1:N����� 1�� �տ� ���Բ�
public class DeptEmpVO {
	int deptno; //  NOT NULL NUMBER(2)
	String dname;// VARCHAR2(14) 
	String loc;//   VARCHAR2(13)
	
	List<EmpVO> empList;
}
