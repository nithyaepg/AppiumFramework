package org.epg.Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.epg.pageObjects.android.LoginPage;
import org.epg.pageObjects.android.PermissionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.epg.TestUtils.AndroidBaseTest;
import org.epg.TestUtils.ListenerClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

//@Listeners(ListenerClass.class)
public class EPFleet_tc_1_Login extends AndroidBaseTest {

	@Test(dataProvider = "getData" , priority = 0, groups = {"Smoke"}, description = "This method is to Login to the application")
	public void LoginForm(HashMap<String, String> input) throws InterruptedException {
		// loginPage.permissionAllow();
		permissionPage.allowButton();
		
		loginPage.userNameField(input.get("username"));
		loginPage.passWordField(input.get("password"));
		loginPage.passwordView();
		loginPage.remembermeCheckbox();
		loginPage.loginButton();

		Thread.sleep(7000);
		// WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		
		permissionPage.closeButton();	
		Thread.sleep(1000);
		permissionPage.locationDenyButton();
		homePage.syncButton();
			//Thread.sleep(3000);
			
		
			//permissionPage.allowButton();
			//permissionPage.locationNoThanksButton();
		Thread.sleep(5000);
			
			
}
		
		

//	@BeforeMethod(alwaysRun=true)
//	public void preSetup()
//	{
//	
//		loginPage.setActivity();
//				
//	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/test/java/org/epg/testData/EPFleet-Login.json");

		return new Object[][] 
				{ 
			{ 
				data.get(0) 
				
			}
			
				};
	}
}
