package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoapplication {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
		Select dropdown;
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("gender-male")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("Saimallik");
		 driver.findElement(By.id("LastName")).sendKeys("Rameshwaram");
		 driver.findElement(By.id("Email")).sendKeys("rameshwaramsaim@gmail.com");
		 driver.findElement(By.id("Company")).sendKeys("Massmutual");
		 WebElement checkbox = driver.findElement(By.id("Newsletter"));
		 if(checkbox.isSelected()) {
			 checkbox.click();
		 }
		 WebElement datedropdown = driver.findElement(By.name("DateOfBirthDay"));
		 dropdown = new Select(datedropdown); 
		 dropdown.selectByIndex(2);
		 WebElement monthdropdown = driver.findElement(By.name("DateOfBirthMonth"));
		  dropdown = new Select(monthdropdown); 
		 dropdown.selectByIndex(2);
		 WebElement yeardropdown = driver.findElement(By.name("DateOfBirthYear"));
		  dropdown = new Select(yeardropdown); 
		 dropdown.selectByIndex(2);
		 driver.findElement(By.id("Password")).sendKeys("Honey1234");
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("Honey1234");
		 WebElement submit = driver.findElement(By.id("register-button"));
		  submit.submit();
		 try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.close();
		 
    }
    
}
