package org.epg.pageObjects.android;

import java.util.List;

import org.epg.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class PermissionPage extends AndroidActions {
	AndroidDriver driver;
	public PermissionPage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(id="com.android.packageinstaller:id/dialog_container")
	public List<WebElement> permissionPopup;
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	public WebElement allowButton;
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_deny_button")
	public WebElement denyButton;
	
	@AndroidFindBy(accessibility ="btn-policy-close")
	public WebElement closeButton;
	
	@AndroidFindBy(accessibility = "btn-location-request-accept")
	public WebElement locationAcceptButton;
	
	@AndroidFindBy(accessibility = "btn-location-request-deny")
	public WebElement locationDenyButton;
	
	@AndroidFindBy(accessibility = "label-bglocation-request-nothanks")
	public WebElement locationNoThanksButton;
	
	public void allowPermission()
	{
		
		((WebElement) permissionPopup).click();
	}

	public void allowButton() {
		
	
		allowButton.click();		
		
	}
	
	public void denyButton() {
		
		
		denyButton.click();		
		
	}
	
	public void closeButton() {
		
		
		closeButton.click();		
		
	}
//	public void locationAcceptButton() {
//		
//		
//		locationAcceptButton.click();		
//		
//	}
	
	public void locationDenyButton() {
		
		
		locationDenyButton.click();		
		
	}
	
	public void locationNoThanksButton() {
		
		locationNoThanksButton.click();		
		
	}
		
}
	

	
	
	

