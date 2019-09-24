package pack2;

import java.util.concurrent.TimeUnit;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import io.cucumber.java.After;
//import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef1 {
	WebDriver driver;
	
 @Given("open url of demoshop {word}")
    public void openweb(String word)
    {
	 System.setProperty("webdriver.ie.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\DRIVER1\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		driver.get("http://demowebshop.tricentis.com/login");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	//Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }
    @When("user enters the {word}")
    public void username(String stringname){
    	driver.findElement(By.id("Email")).sendKeys(stringname);
    }
    @When("user enter the {word}")
    	public void userpassword(String stringpassword)
    	{
    		driver.findElement(By.id("Password")).sendKeys(stringpassword);
    		
    	}
    @Then("user is in webshop as {word}")
    public void openwebshoplogin(String webshopstring){
    	driver.findElement(By.xpath("//input[value='Log in']")).click();
    	driver.findElement(By.linkText("Log Out")).click();
    }
    
  
}
