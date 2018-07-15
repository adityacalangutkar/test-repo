package com.my.project.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.my.project.Employee;

public class EmployeeTest {
	
	List<Employee> actuals = new ArrayList<Employee>();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		actuals.add(new Employee("aditya", 122, 333));
		actuals.add(new Employee("333", 22, 42));

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<Employee> empList = Employee.getEmpList();

		assertEquals(empList, actuals);
	}

}
