package selenium_learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsersetup {
	WebDriver driver;

 public void setupbrowser(String browser,String url)
{
	String fs=System.getProperty("file.separator");
	String dir=System.getProperty("user.dir")+ fs + "Drivers"+fs;
	
	System.out.println(dir);
	System.out.println(System.getProperty("os.name"));
	String extn=System.getProperty("os.name").contains("windows")? ".exe" : "";
	
	System.setProperty("WebDriver.chrome.driver", dir + "chromedriver" +extn);
	
	if(browser.equalsIgnoreCase("chrome"))
	{	
		System.setProperty("WebDriver.chrome.driver", dir + "chromedriver" +extn);	
	driver=new ChromeDriver();
}
	else if (browser.equalsIgnoreCase("edge"))
	{	
		System.setProperty("WebDriver.edge.driver", dir + "msedgedriver" +extn);	
	driver=new EdgeDriver();
}
	else if (browser.equalsIgnoreCase("firefox"))
	{	
		System.setProperty("WebDriver.gecko.driver", dir + "geckodriver" +extn);	
	driver=new FirefoxDriver();
}
	else
	{
		System.out.println("Please provide valid browser");
		System.exit(0);
	}
	if(url!="")
	{
		driver.get(url);	
	}
	else
		driver.get("about:blank");
	
}



}
