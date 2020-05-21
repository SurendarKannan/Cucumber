package TestProgram;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test
	public void test3() {

		System.out.println("test3 : "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test4() {

		System.out.println("test4 : "+ Thread.currentThread().getId());

}
}