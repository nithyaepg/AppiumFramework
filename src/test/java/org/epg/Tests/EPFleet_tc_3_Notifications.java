package org.epg.Tests;

import org.epg.TestUtils.AndroidBaseTest;
import org.testng.annotations.Test;

public class EPFleet_tc_3_Notifications extends AndroidBaseTest {
	@Test(priority = 2)
	public void NotificationsScreen() throws InterruptedException {

	homePage.notificationButton();
	Thread.sleep(3000);
	homePage.notificationBackButton();
}
}
