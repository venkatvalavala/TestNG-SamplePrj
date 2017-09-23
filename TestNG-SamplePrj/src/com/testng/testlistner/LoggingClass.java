package com.testng.testlistner;
import org.testng.annotations.Test;

public class LoggingClass {

	@Test(priority = -1)
	public void methodAddingNumbers() {
		System.out.println("Helloo.. Im in method adding numbers");
	}

	//@Test (priority = 0, expectedExceptions=ArithmeticException.class)
	@Test (priority = 0)
	public void dividedByZero() {
		System.out.println("Helloo.. Im in method divided by zero");
		int e = 1/ 0;
	}

	@Test(dependsOnMethods = { "dividedByZero" })
	public void methodSkip() {
		System.out.println("Helloo.. Im in method skip");
	}

	
}
