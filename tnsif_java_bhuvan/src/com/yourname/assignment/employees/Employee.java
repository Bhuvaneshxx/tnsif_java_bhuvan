package com.yourname.assignment.employees;

public class Employee {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	int employeeid;
	int salary;

	public static void main(String[] args) {
		
	}

}class Manager extends Employee{
	
}class Developer extends Employee{
	
}
