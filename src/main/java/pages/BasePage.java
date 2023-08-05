package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class BasePage {
	 WebDriver driver;
     ElementUtils elementUtils;
     
	   public BasePage(WebDriver driver)
	     {
		     this.driver=driver;
		     PageFactory.initElements(driver,this);
		     elementUtils = new ElementUtils(driver);
	     }

}
