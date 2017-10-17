package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 private WebDriver driver;
 public HomePage(WebDriver driver){
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
     }
	@FindBy (xpath="//*[@id='nav-link-accountList']/span[1]")
	public WebElement signIn;
	
	@FindBy(id="createAccountSubmit")
	public WebElement creatAcc;
	
	
}
