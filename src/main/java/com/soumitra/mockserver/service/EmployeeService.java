package com.soumitra.mockserver.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumitra.mockserver.model.Employee;




@Service
public class EmployeeService {
	
	
	
	
	private List<Employee> empList=new ArrayList<>(Arrays.asList(
				new Employee("100","Arun","energy","system engineer",25000),
				new Employee("101","Barun","telecom","system engineer",35000),
				new Employee("102","Arun","green energy","system engineer",45000),
				new Employee("103","Ram","health","system engineer",25000),
				new Employee("104","jhon","transport","system engineer",50000)				
			));
	
	public List<Employee> getAllEmployees(){
		return empList;
	}
	
	public Employee getEmployee(String Id) {
		return empList.stream().filter(t-> t.getEmpId().equals(Id)).findFirst().get();
	}
	
	
	public String addEmployee(Employee emp) {
		empList.add(emp);
		return "added sucessfully";
	}
	
	
}
