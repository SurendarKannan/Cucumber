package test;

import org.testng.annotations.Test;

public class TestCase3 {

	@Test
	public void test5() {

		System.out.println("test5 : " + Thread.currentThread().getId());
	
	}
	@Test
	public void test6() {
		System.out.println("test6 : " + Thread.currentThread().getId());
	}
}
