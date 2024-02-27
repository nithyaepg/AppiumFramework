package org.epg.pageObjects.android;

import org.epg.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ScanPage extends AndroidActions {
	
	AndroidDriver driver;
	
	public ScanPage(AndroidDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility="input-awb")
	private WebElement scanToAddField;
	
	public void scanToAddField(String awbnumber)
	{
		scanToAddField.sendKeys(awbnumber);
		driver.hideKeyboard();
		
	}
}
