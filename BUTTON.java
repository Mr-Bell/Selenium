package Sample.Code;

import java.awt.Point;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BUTTON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Calling the URL
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		
		//Click Button by Path
		WebElement getposition =driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/h5");
		getposition.click();
		
		//Finding the position by the XYpoint
		WebElement position=driver.findElementByXPath("//*[@id=\"position\"]");
        org.openqa.selenium.Point xypoint= position.getLocation();
        int xvalue=xypoint.getX();
        int yvalue=xypoint.getY();
        
        //Print XYvalue
        System.out.println(xvalue);
        System.out.println(yvalue);
        
        driver.close();
        
	}

}
