package org.epg.Tests;

import org.epg.TestUtils.AndroidBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class EPFleet_tc_2_Menu extends AndroidBaseTest{
	@Test(priority = 1)
	public void HomePage() throws InterruptedException {
		
	homePage.menuButton();
	
	WebElement element = driver.findElement(AppiumBy.accessibilityId("label-version"));

        // Get the text from the element
        
	String ActualVersion= element.getText();
	String ExpectedVersion = "Version (1.0.25)";
	Assert.assertEquals(ExpectedVersion, ActualVersion);
	System.out.println("The App version is " + ExpectedVersion);
	homePage.menuButton();
	Thread.sleep(3000);
}
}
