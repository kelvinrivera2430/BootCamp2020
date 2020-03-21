package com.expidia;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Expidia_bootcamp {
	WebDriver driver;
	  @Test
	  public void f() throws IOException, InterruptedException {
		  Actions window=new Actions(driver);
		  
		  WebElement Flight=driver.findElement(By.linkText("Flights"));
		  Flight.click();
		  WebElement orgn=driver.findElement(By.xpath("//*[@class=\"clear-btn-input gcw-storeable text gcw-origin gcw-required gcw-distinct-locations \"]"));
		  orgn.click(); orgn.sendKeys("Washington, DC (IAD-Washington Dulles Intl.");
		  WebElement back=driver.findElement(By.id("flight-destination-flp"));
		  back.click();back.sendKeys("San Salvador, El Salvador (SAL-El Salvador Intl.)");
		  
		  
		  driver.findElement(By.id("flight-departing-flp")).click();
		  driver.findElement(By.xpath("(//*[@type='button'])[51]")).click();
		  driver.findElement(By.id("flight-returning-flp")).click();
		  driver.findElement(By.xpath("(//*[@class='datepicker-day-number notranslate'])[61]")).click();
		  Thread.sleep(6000);
		  driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/div[7]/label/button")).click();
		  
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@type=\"button\"])[35]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@type=\"button\"])[37]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@data-test-id=\"select-button\"])[1]")).click();
		
			driver.findElement(By.xpath("(//button[@data-test-id='select-button'])[2]")).click();
			
			ArrayList<String> page = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(page.get(1));
			driver.findElement(By.id("bookButton")).click();

			driver.findElement(By.id("firstname[0]")).sendKeys("first name");
			driver.findElement(By.xpath("//input[@data-tealeaf-name='middleName']")).sendKeys("middl name");
			driver.findElement(By.id("lastname[0]")).sendKeys("last name");
			driver.findElement(By.id("phone-number[0]")).sendKeys("7575757575");
			driver.findElement(By.id("gender_male[0]")).click();

			Select pick = new Select(driver.findElement(By.id("date_of_birth_month0")));
			pick.selectByIndex(8);
			Select day = new Select(driver.findElement(By.id("date_of_birth_day[0]")));
			day.selectByVisibleText("08");
			Select year = new Select(driver.findElement(By.id("date_of_birth_year[0]")));
			year.selectByVisibleText("1980");
			
			
			
			
			driver.findElement(By.xpath("(//input[@name=\"creditCards[0].cardholder_name\"])[2]")).sendKeys("45484651584651");
			
			Select month = new Select(driver.findElement(By.xpath("//select[@data-tealeaf-name=\"expirationMonth_1\"]")));
			month.selectByVisibleText("08-Aug");
			
			Select year1= new Select(driver.findElement(By.xpath("(//select[@data-custom-rules=\"ccExpiry\"])[2]")));
			year1.selectByVisibleText("2024");
			driver.findElement(By.xpath("(//input[@type=\"tel\"])[5]")).sendKeys("444");
			
			driver.findElement(By.id("complete-booking")).click();
		

	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kelvin PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.expedia.com/");
		  
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  
	  }
	   public void Cheese(String Screenshotname) throws IOException {
		   TakesScreenshot ts=(TakesScreenshot)driver;
		   File Source=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(Source, new File("./Cheese/" +timestamp() +Screenshotname +" Cheese.png"));
		   
		   System.out.println("print");
		   
		   
	   }
	   public String timestamp() {
			  return new SimpleDateFormat("yyyy-mm-dd hh-mm-ss ").format(new Date());
		  }
}
