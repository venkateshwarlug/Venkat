
package POMframework;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebwavesLogin
{

	public Menu menu=null;
	
	public WebwavesLogin(WebDriver driver)
	{
		menu=PageFactory.initElements(driver, Menu.class);
	}
	
	@FindBy(name="username")
	WebElement user;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(xpath="//*[@id=\"login-box-inner\"]/form/div[3]/div/button")
	WebElement loginbtn;
	
	public void login(String u, String p) 
	{
		user.clear();
		user.sendKeys(u);
		pass.clear();
		pass.sendKeys(p);
		loginbtn.click();
	}
	
	
	
}