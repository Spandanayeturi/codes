package com.training.capgemini;

public class Employee {
	private String empId;
	private String empName;
	private String empDept;
	private String empSalary;
	
	public void setEmpId(String empId) {//setter
		this.empId=empId;
	}
	public String getEmpId() {//getter
		return empId;
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
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	

}
