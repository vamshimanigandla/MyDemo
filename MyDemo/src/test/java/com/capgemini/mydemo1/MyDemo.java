package com.capgemini.mydemo1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyDemo {

		WebDriver driver = null; 
	
		
	   @Given("^I am on Sample login page$") 
	   public void goToSample() { 
		   System.setProperty("webdriver.chrome.driver", "D://Users//vmanigan//Downloads//chromedriver.exe");
		   driver = new ChromeDriver();
		   
			driver.navigate().to("D:\\Users\\vmanigan\\Desktop\\mani.html");
			//Alert alert=driver.switchTo().alert();
	     }
		
	   @When("^I enter username as (.*)$") 
	   public void enterUsername(String arg1) {   
		   
		//   WebElement searchField1=driver.findElement(By.id("login_field"));
	      driver.findElement(By.name("username")).sendKeys(arg1); 
	   }
		
	   @When ("^I enter password as (.*)$") 
	   public void enterPassword(String arg1) {
	      driver.findElement(By.name("password")).sendKeys(arg1);
	     
	      
	    //  driver.findElement(By.id("u_0_v")).click(); 
	   } 
	   
	 /*  @Then("^Login should pass$") 
	   public void pass()
	   {
		   driver.findElement(By.name("commit")).click();
		   Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			assertEquals(alert.getText(),"successfully logged in!!!");
	   }*/
	   

	   @Then("^Alert successful$") 
	   public void checkpass() { 
		   driver.findElement(By.name("submit")).submit();
		   Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
		   assertEquals(alert.getText(), "Successful");
	   }
		
	   @Then("^Alert failed$") 
	   public void checkfail1() { 
		   driver.findElement(By.name("submit")).submit();
		   Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
		   assertEquals(alert.getText(), "Password Incorrect");
	   }
	   @Then("^Alert failed completely$") 
	   public void checkfail12() { 
		   driver.findElement(By.name("submit")).submit();
		   Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
		   assertEquals(alert.getText(), "Username&Password Incorrect");
	   }
	  
}	
	
	
	
	
	
	
	
	
	

