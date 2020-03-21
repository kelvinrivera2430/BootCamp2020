package com.HomeDepot.Bootcam_2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDP {
WebDriver driver;

@FindBy(id="headerMyAccount")
WebElement Myaccount;
@FindBy (id="SPSORegister")
WebElement Regi;
public HomeDP (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void Maccount() {
	Myaccount.click();
}
public void Register() {
	Regi.click();
}

}
