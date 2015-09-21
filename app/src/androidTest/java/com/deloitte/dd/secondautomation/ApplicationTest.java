package com.deloitte.dd.secondautomation;

import android.app.Application;
import android.os.Debug;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public ApplicationTest() {
        super(MainActivity.class);
    }

    static String output;

    public void testTest() throws InterruptedException, Exception{
        super.setUp();
        final MainActivity ma = super.getActivity();
        String s;
        ma.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ((EditText) ma.findViewById(R.id.editText)).setText("RAHUL JADHAV");
                ma.ButtonClick(null);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {

                }
                output = ((TextView) ma.findViewById(R.id.textView)).getText().toString();
                Log.d("CHECK", output);
            }
        });

        //this.wait();

        //assertTrue(output, false);
        assertTrue(output, output.equals("Hello RAHUL JADHAV"));

   /*    */
        //Thread.sleep(10000);
    }
}

/*import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class {scriptName} {
	public static void main(String[] args) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "Copy of Nexus 5 API 23 x86");
		capabilities.setCapability("app", "/Users/rjadhav/Documents/Automation/SecondAutomation/app/build/outputs/apk/app-debug.apk");
		capabilities.setCapability("appPackage", "com.deloitte.dd.secondautomation");
		capabilities.setCapability("appActivity", "MainActivity");
		wd = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")).click();
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")).sendKeys("rahul");
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();
		wd.close();
	}
}
*/