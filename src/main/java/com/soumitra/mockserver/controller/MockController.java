package com.soumitra.mockserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumitra.mockserver.model.Employee;
import com.soumitra.mockserver.service.EmployeeService;

@RestController
@RequestMapping("/mock")
public class MockController {
	@Autowired
	private EmployeeService empService;
	
	
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees(){
		return empService.getAllEmployees();
	}
	
	@GetMapping("employee/{Id}")
	public Employee getEmployee(@PathVariable String Id) {
		return empService.getEmployee(Id);
	}
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee emp) {
		return empService.addEmployee(emp);
	}
	

}
