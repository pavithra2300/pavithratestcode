package selenium_learn;

import java.time.Duration;

import org.openqa.selenium.By;

public class Alertexample extends Browsersetup{
	
	
	public void alertex() throws InterruptedException
	
	{
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		String var=driver.switchTo().alert().getText();
		//.sendKeys("Hello");
		System.out.println(var);
		driver.switchTo().alert().sendKeys("pavithra");
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Alertexample alt=new Alertexample();
		alt.setupbrowser("chrome", "https://the-internet.herokuapp.com/javascript_alerts");
		
		alt.alertex();
	}

}
