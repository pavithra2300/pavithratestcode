package selenium_learn;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollExample extends Browsersetup {
	
	public void scrollex(){
		setupbrowser("Chrome", "https://www.youtube.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0, 1800)");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScrollExample obj=new ScrollExample();
		obj.scrollex();
	}

}
