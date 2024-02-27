package org.epg.pageObjects.android;

import org.epg.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends AndroidActions{
	
	AndroidDriver driver;

	
	public LoginPage(AndroidDriver driver)
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
		
	}
	
//	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
//	private WebElement permissionAllow;
	
	@AndroidFindBy(accessibility="input-username")
	private WebElement usernameField;
	
	@AndroidFindBy(accessibility="input-password")
	private WebElement passwordField;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"\"]")
	private WebElement passwordView;
	
	
	@AndroidFindBy(accessibility="remembermecheckbox")
	private WebElement remembermeCheckbox;
	
	
	@AndroidFindBy(accessibility = "btn-login")
	private WebElement loginButton;
	
//	public void permissionAllow()
//	{
//		permissionAllow.click();
//		
//	}
	public void userNameField(String username)
	{
		usernameField.sendKeys(username);
		driver.hideKeyboard();
		
	}
	public void passWordField(String password)
	{
		passwordField.sendKeys(password);
		driver.hideKeyboard();
		
	}
	
	public void passwordView()
	{
		passwordView.click();
		
	}
	
//	public void setActivity()
//	{
//		Activity activity = new Activity("com.courier.staging", "com.courier.MainActivity");
//		
//		driver.startActivity(activity);
//	}

	public void remembermeCheckbox()
	{
		remembermeCheckbox.click();
		
	}
	
	
	public void loginButton()
	{
		loginButton.click();
		
	}
	
	
	
	
	
}
