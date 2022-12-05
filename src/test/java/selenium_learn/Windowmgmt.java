package selenium_learn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Windowmgmt extends Browsersetup{
	
	public void window()
	{
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='intagram']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Windowmgmt win=new Windowmgmt();
		win.setupbrowser("chrome", "https://www.facebook.com/");
		win.window();
		
		
	}

}
