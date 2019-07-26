package hiddenlinkes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineQA");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.bing.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
      System.out.println("no.of links "+" "+links.size());
      int count=0;		
      for(int i=0; i<links.size();i++)
      		{
    	  if(links.get(i).isDisplayed())
    	  
    		  count++;
      		}
	System.out.println("no.of visible links are"+" "+count);
	
	   		
    System.out.println("no.of hidden links"+" "+( links.size()-count));

	}
}


