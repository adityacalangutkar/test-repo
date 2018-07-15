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

import com.my.project.EvenOdd;

/**
 * @author 10639492
 *
 */
public class EvenOddTest {

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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsEvenTrue() {
		EvenOdd evenOdd = new EvenOdd();
		boolean result = evenOdd.isEvenNumber(2);
		assertEquals(true, result);
	}

	@Test
	public void testIsEvenFalse() {
		EvenOdd evenOdd = new EvenOdd();
		boolean result = evenOdd.isEvenNumber(3);
		assertFalse(result);
	}

	@Test
	public void test() {
		String[] expected = { "apple", "mango" };

		String[] actual = { "apple", "mango" };

		assertArrayEquals(expected, actual);
	}

}
