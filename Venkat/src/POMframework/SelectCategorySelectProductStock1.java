package POMframework;



import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCategorySelectProductStock1 
{
   public Menu menu=null;
	
	public SelectCategorySelectProductStock1(WebDriver driver)
	{
		menu=PageFactory.initElements(driver, Menu.class);
	}
	
	@FindBy(id="category")
	WebElement sc;
	
	@FindBy(id="stock")
	WebElement sps;
	
	
	public void scCat(String x)
	{
		sc.sendKeys(x);
	}

	public void spStock(String y)
	{
		sps.sendKeys(y);
	}
	
	
}


