package Dframework;

import java.io.FileInputStream;


import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Propert {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	FileInputStream fso;
@BeforeTest
public void open() {
	pr=new ProfilesIni();
  fp=pr.getProfile("onlineQA");
  driver=new FirefoxDriver();
  driver.get("https://opensource-demo.orangehrmlive.com/"); 
}
@Test
public void data() throws Exception
{
fso=new FileInputStream("C:\\Users\\lenovo\\workspace\\Venkat\\venkatesh.properties");
Properties pr=new Properties();
pr.load(fso);
driver.findElement(By.id(pr.getProperty("user"))).clear();

driver.findElement(By.id(pr.getProperty("user"))).sendKeys("Admin");

driver.findElement(By.id(pr.getProperty("pas"))).clear();
driver.findElement(By.id(pr.getProperty("pas"))).sendKeys("admin123");
driver.findElement(By.id(pr.getProperty("log"))).click();
}
}