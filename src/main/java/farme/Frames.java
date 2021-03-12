package farme;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calling the driver
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//calling URL
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		
		
		WebElement fram=driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[10]/a/h5");
		fram.click();
		
		
		driver.switchTo().frame(0);
		WebElement clickbtn=driver.findElementById("Click");
		clickbtn.click();
// Getting the text
		
		String name= driver.findElementById("Click").getText();
		System.out.println(name);
		 WebElement clickbtns=driver.findElementById("Click1");
		 clickbtns.click();
		 
		 String names=driver.findElementById("Click1").getText();
		 System.out.println(names);
		  driver.switchTo().defaultContent();
		  
		  java.util.List<WebElement>
		  allframes=driver.findElementsByTagName("iframe");
		  int size=allframes.size();
		  System.out.println(size);
		  
		  
		
		
	}

}
