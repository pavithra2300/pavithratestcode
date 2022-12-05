package selenium_learn;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

 

public class Waitsexample extends Browsersetup{
	
	
	public void impwait() 
	 {
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavi@gmail.com");
		
		//hidden element
		driver.findElement(By.xpath("//input[@name='jazoest']")).sendKeys("1234");
		

		
		
		
		
 }
	
	public void expwait()
	{
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		WebElement hid=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='jazoest']"))));
		hid.sendKeys("1234");
		
	}
	
	public void fluentwait()
	{
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(20))
				  .pollingEvery(Duration.ofSeconds(2))
				  .ignoring(NoSuchElementException.class);

				//WebElement foo = wait.until(driver.findElement(By.xpath("//input[@name='jazoest']")));
				
		//WebElement email=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='email']"))));
				//email.sendKeys("pavi@gmail.com");
				
		
	 WebElement
		 hid=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(
		 "//input[@name='jazoest']")))); hid.sendKeys("1234");
		   
		
}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Waitsexample obj=new Waitsexample();
		obj.setupbrowser("chrome", "https://www.facebook.com/");
		obj.impwait();
		//obj.expwait();
		//obj.fluentwait();
		
	}

}
