package com.thymeleaf.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thymeleaf.demo.model.Employee;

//import javax.annotation.PostConstruct;

@Controller

@RequestMapping("/employee")
public class EController {

	private List<Employee> listEmployee;
	
	@jakarta.annotation.PostConstruct
	private void LoadData() {
		Employee emp1=new Employee(1,"Robert","Archibald","rarchibald@gmail.com");
		Employee emp2=new Employee(2,"Rohan","Chatterjee","rchatterjee@gmail.com");
		Employee emp3=new Employee(3,"Raghuveer","Setty","rSetty@gmail.com");
		Employee emp4=new Employee(4,"Rob","Williams","rwilliams@gmail.com");
		
		listEmployee=new ArrayList<>();
		
		listEmployee.add(emp1);
		listEmployee.add(emp2);
		listEmployee.add(emp3);
		listEmployee.add(emp4);
		
	}
	@GetMapping("/list")
	public String showEmp(Model model) {
		
		model.addAttribute("employee", listEmployee);
		return "employee-list";
	}
}

