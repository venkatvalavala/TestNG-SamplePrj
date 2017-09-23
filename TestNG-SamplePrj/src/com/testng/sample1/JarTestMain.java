package com.testng.sample1;

import com.beust.testng.TestNG;
import java.util.Scanner;

public class JarTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TestNg test Jar file,, Main class");
		TestNG testng = new TestNG();
		System.out.println("Please Enter your choice for Test class:");
		System.out.println("1  for Helloworld class");
		System.out.println("2 for NewTest ");
		System.out.println("3 Run All Test clasees ");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		Class[] classes1;
		 Class[] classes;
		switch (choice) {
		
		case 1:    
			 //code to be executed; 
			 classes1 = new Class[]{HelloWorld.class};
		        testng.setTestClasses(classes1);
		        testng.run();
		        
			 break;  //optional  
			case 2:    
			 //code to be executed;  
				  classes = new Class[]{NewTest.class};
			        testng.setTestClasses(classes);
			        testng.run();
			 break;  //optional  
			 
			case 3:    
				 //code to be executed;  
				classes1 = new Class[]{HelloWorld.class};
				        testng.setTestClasses(classes1);
				        testng.run();				        
				        classes = new Class[]{NewTest.class};
				        testng.setTestClasses(classes);
				        testng.run();
				        
				 break;  //optional  
			    
			    
			default:     
				System.out.println("User is not selected correct choice");    
		}
       

	}

}
