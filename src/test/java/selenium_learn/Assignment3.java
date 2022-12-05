package selenium_learn;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Assignment3 extends Browsersetup{
	
	
	public void edurekalogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class='login_click login-vd giTrackElementHeader ']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@class='control_place popusreml' and @id='si_popup_email']")).sendKeys("pavigowda.08@gmail.com");
	}

	public static void main(String[] args) throws InterruptedException {

		Assignment3 obj=new Assignment3();
		obj.setupbrowser("chrome", "https://www.edureka.co/");
		obj.edurekalogin();

	}

}
