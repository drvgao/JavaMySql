package com.maven.java;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class AppiumTest {
	private static Logger log = LogManager.getLogger(AppiumTest.class.getName());
	
  @Test
  public void f() {
	  System.out.println("test ng test1. is printed?");
	  log.info("hello");
  }
}
