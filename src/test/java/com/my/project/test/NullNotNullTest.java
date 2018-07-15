/**
 * 
 */
package com.my.project.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.my.project.NullNotNUll;

/**
 * @author 10639492
 *
 */
public class NullNotNullTest {
	
	private NullNotNUll n;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		n = new NullNotNUll();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNull() {
		String value = n.getValue("adi");
		assertNull(value);
	}
	
	@Test
	public void testNotNull() {
		String value = n.getValue("1");
		assertNotNull(value);
	}

}
