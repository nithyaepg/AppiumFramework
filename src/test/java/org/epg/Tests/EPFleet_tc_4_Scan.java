package org.epg.Tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.epg.TestUtils.AndroidBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EPFleet_tc_4_Scan extends AndroidBaseTest {
	@Test(dataProvider = "getData" , priority = 3)
	public void NotificationsScreen(HashMap<String, String> input) throws InterruptedException {

		homePage.scanButton();	
}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/test/java/org/epg/testData/EPFleet-Scan.json");

		return new Object[][] 
				{ 
			{ 
				data.get(0) 
				
			}
			
				};
	}
}
