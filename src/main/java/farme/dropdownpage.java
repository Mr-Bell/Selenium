package farme;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calling the driver
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				
				//calling URL
				driver.get("http://testleaf.herokuapp.com/");
				driver.manage().window().maximize();
				
		WebElement dropdown=driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/h5");		
	dropdown.click();
	
	}

}
