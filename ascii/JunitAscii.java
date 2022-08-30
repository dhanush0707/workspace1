package com.ascii;
import org.junit.Ignore;
import org.junit.Test;
public class JunitAscii {
	@Test 
	public void test1() {
		System.out.println("test 1");

	}
    @Test
	public void test2() {
		System.out.println("test 2");

	}
    @Ignore
    @Test
	public void test3() {
		System.out.println("test 3");

	}
    @Ignore
    @Test
	public void test4() {
		System.out.println("test 4");

	}
    @Test
	public void test5() {
		System.out.println("test 5");
	}
}
