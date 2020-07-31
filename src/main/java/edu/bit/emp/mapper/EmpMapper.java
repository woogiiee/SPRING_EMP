package edu.bit.emp.mapper;

import java.util.List;

import edu.bit.emp.vo.EmpVO;

public interface EmpMapper {
	List<EmpVO> getList();	//다형성을 활용하려고  arraylist대신에 그냥 list를 쓴다.
}
