package Sample.Code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//Calling URL
		driver.get("http://leafground.com/home.html");
		driver.manage().window().maximize();
		
		//Clicking the Alert box
		WebElement alertbox= driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/h5");
		alertbox.click();
		WebElement clickbox=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button");
		clickbox.click();
		
		//Alert message  
		org.openqa.selenium.Alert alert= driver.switchTo().alert();
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		alert.accept();
		
		//clicking the alert
		WebElement confirmbox=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button");
		confirmbox.click();
		
		
		org.openqa.selenium.Alert alert1=driver.switchTo().alert();
		String confirmmsg=driver.switchTo().alert().getText();
		System.out.println(confirmmsg);
		alert1.dismiss();
		
		driver.close();
	
	}

}
