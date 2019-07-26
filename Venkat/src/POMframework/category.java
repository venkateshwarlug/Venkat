package POMframework;

import java.awt.Menu;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class category
{
	ProductManagement pm;
	FirefoxDriver driver;
	WebwavesLogin wb;
	
	

@Test
public void opera() throws IOException
{
	 wb= PageFactory.initElements(driver, WebwavesLogin.class);
	pm=PageFactory.initElements(driver, ProductManagement.class);
	 wb.login("KalpanaQA@gmail.com", "12345");
	pm.productManage();
	WebElement category=driver.findElement(By.id("category"));
	List<WebElement> cate=category.findElements(By.tagName("option"));
			FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\Desktop\\New Microsoft Office Excel Worksheet.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(fis);
	XSSFSheet wso=wbo.getSheet("sheet2");
	Row r;
	for(int n=0;n<wso.getLastRowNum();n++)
	{
		r=wso.getRow(n);     
		for(int i=0;i<cate.size();i++)
		{
	
		
		r.createCell(1).setCellValue(cate.get(i).getText());
		String exp=r.getCell(0).getStringCellValue();
		if(r.getCell(1).getStringCellValue().equals(exp))
		{
			r.createCell(2).setCellValue("pass");
		}
		else
		{
			r.createCell(2).setCellValue("fail");
		}
	
}
	}
	FileOutputStream os=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\New Microsoft Office Excel Worksheet.xlsx");
			wbo.write(os);
			wbo.close();
	
			
}
}




