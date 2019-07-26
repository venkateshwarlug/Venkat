package POMframework;



import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductManagement
{

public Menu menu=null;
	
	public ProductManagement(WebDriver driver)
	{
		menu=PageFactory.initElements(driver, Menu.class);
	}
	
	@FindBy(xpath="//*[@id=\"product_menu_id\"]/a")
	WebElement pm;
	@FindBy(xpath="//*[@id=\"inventory_control\"]/a")
	WebElement invc;
	
	
	public void productManage()
	{
		pm.click();
		invc.click();
		
		
	}
	
}


