package com.junitannotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotation {
	
	@BeforeClass
	public static void test1() {
		System.out.println("before class 1");

	}
	@Before
	public void test2() {
		System.out.println("before 2");

	}
	@Test
	public void test3() {
		System.out.println("test 3");

	}
	@After
	public void test4() {
		System.out.println("aftre 4");

	}
    @AfterClass
    public static void test5() {
		System.out.println("after class 5");

	}
}
