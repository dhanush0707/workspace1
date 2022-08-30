package com.whatisassert_;
import org.junit.Test;
import junit.framework.Assert;
public class AssertClass {
	@Test
	public void test1() {
       
		System.out.println("a");
		Assert.assertTrue(true);
		System.out.println("b");
		Assert.assertTrue(false);
		System.out.println("c");
		Assert.assertTrue(false);
		System.out.println("d");
		
	}
}
