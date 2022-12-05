package selenium_learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeExample extends Browsersetup {

	
		public void iframeDemo() {
			//index
//			driver.switchTo().frame(0);
			
			//id or name
//			driver.switchTo().frame("mce_0_ifr");
			
			//webelement
			WebElement iframeElem = driver.findElement(By.id("mce_0_ifr"));
			driver.switchTo().frame(iframeElem);
			
			WebElement elem = driver.findElement(By.xpath("//p"));
			System.out.println(elem.getText());
			
			
			//go back to base page
			driver.switchTo().defaultContent();
			
			String basePageMsg = driver.findElement(By.tagName("h3")).getText();
			System.out.println(basePageMsg);
		}
		
		public static void main(String[] args) {
			IframeExample obj = new IframeExample();
			obj.setupbrowser("chrome", "https://the-internet.herokuapp.com/iframe");
			obj.iframeDemo();
		}

	

	}


