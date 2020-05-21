package test;

import org.testng.annotations.Test;

public class TestCase1 {
	

	@Test
	public void test1() {

		System.out.println("test1 :" + Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {

		System.out.println("test2 : " + Thread.currentThread().getId());
	}

}
