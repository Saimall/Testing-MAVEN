package com.testing;

import java.util.Scanner;  

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;
//import org.openqa.selenium.WebDriver;

public class Selenium_first_class {

	public static void main(String[] args) {
		
		 Scanner obj = new Scanner(System.in); 
		 System.out.println("Enter the browser name");
		 String userName = obj.nextLine();
		 switch(userName) {
		 
		 case "chrome":
			 ChromeDriver driver = new ChromeDriver();  
			 driver.get("https://www.instagram.com/");
			 break;
		 case "firefox":
			 FirefoxDriver driver1 = new FirefoxDriver();
			 driver1.get("https://www.instagram.com/");
			 break;
		 case "edge":
			 EdgeDriver driver2 = new EdgeDriver();
			 driver2.get("https://www.instagram.com/");
			 break;
		
		default:
			 System.out.println("In coreect browser");
			 
		 
		 }
     
     
    

	}

}
