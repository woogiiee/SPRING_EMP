package edu.bit.emp.mapper;

import java.util.List;

import edu.bit.emp.vo.DeptEmpVO;
import edu.bit.emp.vo.EmpVO;

public interface EmpMapper {
	List<EmpVO> getList();	//�������� Ȱ���Ϸ���  arraylist��ſ� �׳� list�� ����.
	
	DeptEmpVO selectDeptEmp(int deptno);
}
