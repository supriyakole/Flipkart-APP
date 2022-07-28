package flipkart;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartApp {

	private AndroidDriver driver;

	@BeforeMethod
	public void setUp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:platformVersion", "8.1.0");
		desiredCapabilities.setCapability("appium:deviceName", "Android SDK for windows 86");
		desiredCapabilities.setCapability("appium:appPackage", "com.flipkart.android");
		desiredCapabilities.setCapability("appium:appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.getSessionId() ;
		Thread.sleep(5000);
	}

	@Test
	public void sampleTest() {
		MobileElement el0 = (MobileElement) driver.findElementById("android:id/aerr_restart");
		el0.click(); 
		
		MobileElement error = (MobileElement) driver.findElementById("android:id/aerr_restart");
		error.click();
		MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.RelativeLayout[4]//android.widget.ImageView[1]");
		
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.flipkart.android:id/select_btn");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.flipkart.android:id/custom_back_icon");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.flipkart.android:id/search_widget_textbox");
		el4.click();
	
	
	//serach a new product on serach bar-Mobiles
		List<MobileElement> els1 = (List<MobileElement>) driver.findElementsByAccessibilityId("com.flipkart.android:id/search_autoCompleteTextView\");");
		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementById("com.flipkart.android:id/not_now_button");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Back Button");
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementById("com.flipkart.android:id/clear_text");
		el9.click();
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}





