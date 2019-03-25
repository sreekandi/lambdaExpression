package com.capgemini.lambda.client;

import java.util.Comparator;
import java.util.TreeSet;

import com.capgemini.lambda.Employee;



public class EmployeeClient {
	
	public static void main(String[] args)
	{
//		Comparator<Employee> c=new Comparator<Employee>()
//		{
//			@Override
//			public int compare(Employee  e1,Employee e2)
//			{
//			return Integer.compare(e1.getEmployeeId(),e2.getEmployeeId());
//		}
//			
//		};
		Comparator<Employee> c=(emp1,emp2)->Integer.compare(emp1.getEmployeeId(),emp2.getEmployeeId());
		
		TreeSet<Employee> employees=new TreeSet<>(c);
	
	employees.add(new Employee(101,"sree","hr",34000.0));
	employees.add(new Employee(102,"vidhya","Admin",12000.0));
	employees.add(new Employee(103,"shiva","Admin",24000.0));
	employees.add(new Employee(104,"teja","hr",12000.0));
	
	for(Employee employee:employees)
	{
		System.out.println(employee);
	}
	}
}
