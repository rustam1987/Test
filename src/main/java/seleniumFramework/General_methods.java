package seleniumFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class General_methods {
	 public WebDriver driver;
  public void setBrowser(String browserType){

	 
		if(browserType.equalsIgnoreCase("chrome")){
			String dir=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", dir+"\\browserDriver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
        }
		else{
			System.out.println("Please check browser type");
		}
     } 
  
  public void setUrl(String url){
	  driver.get(url);
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
  }
  public void clickWebElement(WebElement element){
	  element.click();
  }
  public void closeUrl(){
	  driver.close();
  }
  
}
