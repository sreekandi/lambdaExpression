package com.capgemini.lambda;

import java.util.Objects;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private double employeeSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, String employeeDepartment, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeSalary=" + employeeSalary + "]";
	}
	@Override
	public boolean equals(Object obj)
	
	{
		if(obj==null)
			return false;
		if(!(obj instanceof Employee))
			return false;
		if(obj==this)
			return true;
		Employee employee=(Employee) obj;
		if(this.employeeId==employee.employeeId && this.employeeName==employee.employeeName)
			return true;
		return true;
		
		
	}
	@Override
	public int hashCode()
	{
		return (Objects.hash(employeeId,employeeName));
	}
	
	
	
	
}

