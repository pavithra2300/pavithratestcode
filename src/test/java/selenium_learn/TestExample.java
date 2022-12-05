package selenium_learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestExample extends Browsersetup {
	
	
	public void login() throws InterruptedException
	{
		WebElement uname=driver.findElement(By.xpath(("//input[starts-with(@name,'em')]")));
		uname.sendKeys("pavi@gmail.com");
		 
		driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(3000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		TestExample test=new TestExample();
		
		test.setupbrowser("chrome","https://www.facebook.com");
		test.login();
		

	}

}
