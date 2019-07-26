package appachipoi;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursAppachi {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
    XSSFSheet wso;
FileOutputStream fo;

@BeforeTest
public void open()
{
	pr=new ProfilesIni();
  fp=pr.getProfile("onlineQA");
  driver=new FirefoxDriver();
  driver.get("http://www.newtours.demoaut.com/");
}
@Test
public void test() throws Exception 
{
	driver.findElement(By.linkText("REGISTER")).click();
	FileInputStream fso=new FileInputStream("C:\\Users\\lenovo\\Desktop\\sheet1.xlsx");
	  wbo =new XSSFWorkbook(fso);
	   wso=wbo.getSheet("sheet1");
	  Row r;
	  WebElement c=driver.findElement(By.name("Country"));
	  List<WebElement>value=c.findElements(By.tagName("option"));
	  for(int i=0;i<value.size();i++){
		  r=wso.createRow(i);
		  r.createCell(0).setCellValue((value.get(i).getText()));
		  System.out.println((value.get(i).getText()));
	  }
			FileOutputStream fo=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\sheet1.xlsx");
	           wbo.write(fo);
	           driver.close();
	  }
	  
}

