package test;

import org.testng.annotations.Test;

public class TestCase4 {

	@Test
	public void test7() {

		System.out.println("test7 : " + Thread.currentThread().getId());
	}
	
	@Test
	public void test8() {

		System.out.println("test8 : " + Thread.currentThread().getId());
	}
}
