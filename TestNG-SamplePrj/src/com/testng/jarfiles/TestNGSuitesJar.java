package com.testng.jarfiles;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.beust.jcommander.internal.Lists;

public class TestNGSuitesJar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TestNg Suite Jar file Main class");
		System.out.println("Using this class we can create a Test suite with XML files");
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add("C:/Users/sreer/venkat-java/workspace/TestNG-SamplePrj/testng.xml");//path to xml..
//		suites.add("c:/tests/testng2.xml");
		testng.setTestSuites(suites);
		testng.run();		

	}

}
