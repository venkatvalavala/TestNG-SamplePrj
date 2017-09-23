package com.testng.sample1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelloWorld {
	 int testInt;
	 
	    @BeforeMethod
	    public void setUp() {
	        testInt = 0;
	    }
	 
	    @Test
	    public void addTest() {
	        testInt++;
	    //    assert (testInt == 1);
	        System.out.println("add test");
	    }
	 
	    @Test
	    public void subtractTest() {
	        testInt--;
	     //   assert (testInt == -1);
	        System.out.println("subtract test");
	    }

}
