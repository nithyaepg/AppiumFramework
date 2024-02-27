package org.epg.pageObjects.android;

import java.util.List;

import org.epg.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends AndroidActions {
	
	AndroidDriver driver;
	
	public HomePage(AndroidDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility="btn-sync")
	private WebElement syncButton;
	
	@AndroidFindBy(accessibility="btn-menu")
	private WebElement menuButton;
	
	@AndroidFindBy(accessibility="label-version")
	private WebElement versionCheck;
	
	@AndroidFindBy(accessibility="btn-notification")
	private WebElement notificationButton;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"btn-left-notifications\"]/android.view.ViewGroup")
	private WebElement notificationBackButton;
	
	@AndroidFindBy(accessibility="label-scantoadd")
	private WebElement scanButton;
	
	
	public void syncButton(){
		syncButton.click();
	}
	
	public void menuButton() throws InterruptedException {
		menuButton.click();
		Thread.sleep(2000);
	}
	
	public void notificationButton() throws InterruptedException {
		notificationButton.click();
		Thread.sleep(2000);
	}
	
	public void notificationBackButton() throws InterruptedException {
		notificationButton.click();
		Thread.sleep(2000);
	}
	
	public void scanButton(){
		scanButton.click();
	}
		
}
