package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.EmployeeService;
import models.*;

@Controller
public class HomeController {

	@Autowired
	EmployeeService p;
	@RequestMapping("/")
	public String showHome()
	{
		return "index";
	}
	
	@RequestMapping("productdetails")
	public ModelAndView showProducts()
	{
		ModelAndView mv=new ModelAndView("productdetails");
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList=p.getAllEmployee();
		mv.addObject("listfromtab",employeeList);
		return mv;
	}
}
