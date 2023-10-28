package com.junit4.demo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {
	public static int num1 = 10;
	public static int num2 = 100;

	// BeforeClass annotation will run only once before executing all the methods in
	// the class or suite
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Inside Before Class Method");
	}

	// AfterClass annotation will run only once after executing all the methods in
	// the class or suite
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Inside after Class Method");
	}

	// Before annotation will run Before executing each testCase
	@Before
	public void setUp() throws Exception {
		System.out.println("Inside Before Method");
	}

	// After annotation will run After executing each testCase
	@After
	public void tearDown() throws Exception {
		System.out.println("Inside after Method");
	}

	@Test
	public void test1() {
		System.out.println("Inside test1 Method");
		Assert.assertEquals(100, num2);
	}

	@Test
	public void test2() {
		System.out.println("Inside test2 Method");
		assertEquals(100, num2);
	}

}
