package test.WFH1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StrictFilterPOM {
	StrictFilterPOM(WebDriver driver){
	PageFactory.initElements(driver, this);	
	}

	 @FindBy(xpath="//*[@id='idEmail']")
     private WebElement username;

     @FindBy(xpath="//*[@id='password1']")
     private WebElement password;

     @FindBy(xpath="//*[@id='login-button']")
     private WebElement login;
	
     @FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[5]")
     private WebElement editpp;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEditpp() {
		return editpp;
	}

     
	@FindBy(xpath="//div[@class='fright spp_btn']")
    private WebElement strictfilter;

	public WebElement getStrictfilter() {
		return strictfilter;
	}
     
     
     
     
     
     
     
     
     
}
