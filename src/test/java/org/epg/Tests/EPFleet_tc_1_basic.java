package org.epg.Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.Duration;

import org.epg.TestUtils.AndroidBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class EPFleet_tc_1_basic extends AndroidBaseTest{

	
	
//	@BeforeMethod
//	public void preSetup()
//	{
//		//screen to home page
//		Activity activity = new Activity("com.courier.staging", "com.courier.MainActivity");
//		driver.startActivity(activity);
//		
//		
//	}
//	
	@Test

	public void LoginForm_PositiveFlow() throws InterruptedException
	{
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(AppiumBy.accessibilityId("input-username")).sendKeys("neha.gopal@emiratespost.ae");
		driver.hideKeyboard();
		driver.findElement(AppiumBy.accessibilityId("input-password")).sendKeys("Test@123");
		driver.hideKeyboard();
		driver.findElement(AppiumBy.accessibilityId("remembermecheckbox")).click();
		
		driver.findElement(AppiumBy.accessibilityId("btn-login")).click();
		Thread.sleep(10000);
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		
//		String welcome = driver.findElement(AppiumBy.accessibilityId("label-heading-undefined")).getAttribute("text");
//		AssertJUnit.assertEquals(welcome,"WELCOME BACK !");
		
		
			
	}
	

//	@Test
//	public void FillForm_PositiveFlow() throws InterruptedException
//
//	
//	{
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("");
//		driver.hideKeyboard();
//		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
//		driver.findElement(By.id("android:id/text1")).click();
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.widget.Toast)[1]")).size()<1);
//		
//			
//	}
}
