package com.my.project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee {
	private String name;
	private int empId;
	private int salary;

	public Employee(String name, int empId, int salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public static List<Employee> getEmpList() {
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("aditya", 122, 333));
		e.add(new Employee("333", 22, 42));
		return e;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Employee("Aditya",1, 2);
		Employee e2 = new Employee("Aditya",1, 2);
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		Set<Employee> s = new HashSet<Employee>();
		s.add(e1);
		System.out.println(s.contains(e2));
	}
}
