package com.soumitra.mockserver.model;




public class Employee {
	
	
	private String empId;
	private String empName;
	private String empDept;
	private String designation;
	private Integer salary;
	
//	public Employee() {
//		super();
//	} 
	
	public Employee(String empId, String empName, String empDept, String designation, Integer salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.designation = designation;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	

}
