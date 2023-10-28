package com.junit4.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junit.app.App;

public class AppTest {
	
	App a1;

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
		a1 = new App();
		System.out.println("Inside Before Method");
	}

	// After annotation will run After executing each testCase
	@After
	public void tearDown() throws Exception {
		System.out.println("Inside after Method");
	}

	@Test
	public void test1() {
		assertEquals(10,a1.add(-10, 20));
		assertEquals(-30,a1.sub(-20, 10));
		assertEquals(30,a1.mul(10, 3));
		assertEquals(-2,a1.div(20, -10));
		assertEquals(2,a1.mod(20,9));
		System.out.println("Inside test1 Method");

	}

	@Test
	public void test2() {
		assertEquals(30,a1.add(10, 20));
		assertEquals(10,a1.sub(20, 10));
		assertEquals(30,a1.mul(10, 3));
		assertEquals(2,a1.div(20, 10));
		assertEquals(0,a1.mod(20, 10));
		System.out.println("Inside test2 Method");
	}

}
