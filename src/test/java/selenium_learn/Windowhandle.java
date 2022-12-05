package selenium_learn;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Windowhandle extends Browsersetup{
	
	public void multiplewindow()
	
	{
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;  
	js.executeScript("window.scrollBy(0,1000)");
	System.out.println(driver.getTitle()+driver.getWindowHandle());
	
	driver.findElement(By.xpath("//a[@title='Check out Instagram']")).click();
	ArrayList<String>list=new ArrayList<String>(driver.getWindowHandles());
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
 driver.switchTo().window(list.get(1));
 System.out.println(driver.getTitle()+driver.getWindowHandle());
 driver.switchTo().window(list.get(0));
 System.out.println(driver.getTitle()+driver.getWindowHandle());		
	}

	public static void main(String[] args) {
		Windowhandle obj=new Windowhandle();
		obj.setupbrowser("Chrome", "https://www.facebook.com/");
		obj.multiplewindow();

	}

}
