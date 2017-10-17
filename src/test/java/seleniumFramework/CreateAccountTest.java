package seleniumFramework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.HomePage;

public class CreateAccountTest extends General_methods  {
HomePage oHomePage;
 @BeforeSuite
 public void setBrows(){
setBrowser("chrome");
 }
 @Test(priority=1)
 public void openurl(){
	setUrl("https://www.amazon.com/");
	
 }
 @Test(priority=2)
 public void creatAcc(){
	 oHomePage=new HomePage(driver);
	 oHomePage.signIn.click();
	clickWebElement(oHomePage.creatAcc);
	closeUrl();
	 
 }
	
	
	
}
