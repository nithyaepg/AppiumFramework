package org.epg.TestUtils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.epg.pageObjects.android.HomePage;
import org.epg.pageObjects.android.LoginPage;
import org.epg.pageObjects.android.PermissionPage;
import org.epg.pageObjects.android.ScanPage;
import org.epg.utils.AppiumUtils;
import org.epg.utils.XLUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AndroidBaseTest extends AppiumUtils{

	public static AndroidDriver driver;
	public AppiumDriverLocalService service;
	public LoginPage loginPage;
	public PermissionPage permissionPage;
	public HomePage homePage;
	public ScanPage scanPage;
	
	@BeforeSuite
    public void beforeExecution() {
    	ExtentManager.getReporter();
        
    }

	
	@BeforeTest(alwaysRun=true)
	public void ConfigureAppium() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/org/epg/resources/data.properties");
		String ipAddress = System.getProperty("ipAddress")!=null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
		System.out.println(ipAddress);
		prop.load(fis);
		//String ipAddress = prop.getProperty("ipAddress");
		String port = prop.getProperty("port");
			
		service = startAppiumServer(ipAddress,Integer.parseInt(port));
			
								
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName(prop.getProperty("emulator-5554")); //emulator
		//	options.setDeviceName("Android Device");// real device		
			options.setChromedriverExecutable("/src/main/java/org/epg/resources/chromedriver.exe");
			options.setApp(System.getProperty("user.dir")+"/src/test/java/org/epg/resources/EP Fleet stg  2.apk");
			//options.setAppPackage("courier.staging");
			//options.setAppActivity("com.courier.MainActivity");
			driver = new AndroidDriver(service.getUrl(), options);
			//AndroidDriver driver = new AndroidDriver(capabilities);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 loginPage= new LoginPage(driver);
			 permissionPage = new PermissionPage(driver);
			 homePage = new HomePage(driver);
			 scanPage = new ScanPage(driver);
	}
	
	
//	@DataProvider(name="AWB")
//	public Object [][] getData() throws IOException 
//	{
//		String path=System.getProperty("user.dir")+"/src/main/java/org/epg/resources/Data.xlsx";
// 
//		int rownum=XLUtils.getRowCount(path,"Sheet1");
//		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
// 
//		String logindata[][] =new String [rownum][colcount];
// 
//		for(int i=1;i<=rownum;i++)
//		{
//			for(int j=0;j<colcount;j++)
//			{
//				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i, j); //1 0
// 
//			}
//		}
// 
//		return logindata;
// 
//	}

	
//	@AfterClass(alwaysRun=true)
//	public void tearDown()
//	{
//		driver.quit();
//        service.stop();
//		}
	
	@AfterSuite()
    public void afterSuite() {
        ExtentManager.endReport();
        driver.quit();
    }
	
}
