package javascript;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Dropdown {

	
		public static void main(String[] args)throws Exception
		{
			// TODO Auto-generated method stub
			ProfilesIni pr=new ProfilesIni();
			FirefoxProfile fp=pr.getProfile("onlineQA");
			FirefoxDriver driver=new FirefoxDriver(fp);
			driver.get("https://www.flipkart.com/");
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("C:\\Users\\lenovo\\Desktop\\screen shot\\aki.png"));
	        
		}


	}


