package com.HomeDepot.Bootcam_2020;

import org.openqa.selenium.WebDriver;
import com.HomeDepot.Bootcam_2020.HomeDP;
import com.HomeDepot.Bootcam_2020.sign_in;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void Home() {
	  HomeDP home=new HomeDP(driver);
	  home.Maccount();
	  home.Register();
	  
  }
  @Test
  public void SignIn() throws InterruptedException {
	  Thread.sleep(6000);
	  sign_in signin=new sign_in(driver);
	  signin.Email();
	  signin.Password();
	  signin.ZipCode();
	  signin.PhoneN();
	  signin.Complete();
  }
  @BeforeClass
  @Parameters({"url", "browser"})
  public void beforeClass(String website, String br) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kelvin PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.homedepot.com/");
}
  
}
