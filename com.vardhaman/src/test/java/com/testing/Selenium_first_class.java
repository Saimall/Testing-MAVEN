package com.testing;

import java.util.Scanner;  

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;
//import org.openqa.selenium.WebDriver;

public class Selenium_first_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj = new Scanner(System.in); 
		 System.out.println("Enter the browser name");
		 String userName = obj.nextLine();
		 switch(userName) {
		 
		 case "chrome":
			 ChromeDriver driver = new ChromeDriver();  
			 break;
		 case "firefox":
			 FirefoxDriver driver1 = new FirefoxDriver();
			 break;
		 case "edge":
			 EdgeDriver driver2 = new EdgeDriver();
			 break;
		
		default:
			 System.out.println("In coreect browser");
			 
		 
		 }
     
     
    

	}

}
