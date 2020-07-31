package edu.bit.emp.service;

import javax.inject.Inject;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.emp.mapper.EmpMapper;
import edu.bit.emp.vo.EmpVO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmpServiceImpl implements EmpService{
	
	EmpMapper empMapper;

	@Override
	public List<EmpVO> empList() {
		// TODO Auto-generated method stub
		return empMapper.getList();
	}
	
	


}
