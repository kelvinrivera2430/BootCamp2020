package com.HomeDepot.Bootcam_2020;
import org.openqa.selenium.WebElement;//Global variable
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class sign_in {
	WebDriver driver;
	@FindBy (id="email")
	WebElement Email;
	@FindBy (name ="password")
	WebElement Pass;
	@FindBy (id= "zipCode")
			WebElement Zip; 
	@FindBy (id= "phone")
			WebElement Phone;
	@FindBy (xpath= "//*[@class=\"bttn__content\"]")
	WebElement CreateA;

	public sign_in (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	public void Email() {
		Email.sendKeys("KelvinR@yahoo.com");
	}
	public void Password() {
		Pass.sendKeys("Zettopoop");
	}
	public void ZipCode() {
		Zip.sendKeys("20190");
	}
	public void PhoneN() {
		Phone.sendKeys("0123456789");
	}

	public void Complete() {
		CreateA.click();
	}
}
