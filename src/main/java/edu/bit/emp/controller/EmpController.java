package edu.bit.emp.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.bit.emp.service.EmpService;
import edu.bit.emp.vo.DeptEmpVO;
import edu.bit.emp.vo.EmpVO;
import edu.bit.emp.vo.RecVO;
import edu.bit.emp.vo.SubVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Log4j
@Controller
@AllArgsConstructor

public class EmpController {
	
	private EmpService empService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@GetMapping("emplist")
	public String list(Model model) {
		log.info("list");
		
		List<EmpVO> empList = empService.empList();
		log.info(empList);
		
		model.addAttribute("emps",empList);
		
		return "emplist";
	}
	
	@RequestMapping("/ajax/list")
	public String ajaxList() {
		
		log.info("ajaxList()");
		return "ajaxList";
	}
	
	//Rectangle처리
		@GetMapping("/restful/recArea")
		public String recArea() {
			
			log.info("recArea");
			
			return "recAjax";
			
		}
		
		@ResponseBody
		@RequestMapping("/restful/recAjax")
		public Double recAjax(RecVO rec) {
			
			log.info("recAjax");
			return rec.getArea();
		}
		
	//국영수 총합 처리
		
		@GetMapping("/restful/subadd")
		public String subAdd() {
			
			log.info("subAdd");
			
			return "subAjax";
		}
		
		@ResponseBody
		@RequestMapping("/restful/subAjax")
		public Double subAjax(SubVO sub) {
			
			log.info("subAjax");
			
			return sub.getSum();
		}
		
		
		
		// emp랑 dept join시키는 컨트롤러

		@GetMapping("list/{deptno}")
		public String listDeptEmp(@PathVariable("deptno") int deptno, Model model) {
			log.info("listDeptEmp");

			DeptEmpVO deptEmp = empService.deptEmpList(deptno);
			System.out.println(deptEmp.getEmpList());

			model.addAttribute("emps", deptEmp.getEmpList());

			return "emplist";
		}
		
}
