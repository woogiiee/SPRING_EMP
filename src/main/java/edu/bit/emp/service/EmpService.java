package edu.bit.emp.service;

import java.util.List;

import edu.bit.emp.vo.DeptEmpVO;
import edu.bit.emp.vo.EmpVO;

public interface EmpService {
	
	List<EmpVO> empList();
	DeptEmpVO deptEmpList(int deptno);

	
	

}
