package SeleniumEx.Testsample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		
		WebElement email= driver.findElementById("email");
		email.sendKeys("mr.bell116@gmail.com");
		
		WebElement append =driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");
		append.sendKeys("Welcome");
		
	WebElement Textbox=driver.findElementByName("username");
		String value=Textbox.getAttribute("value");
	System.out.println("value"+value);
		
		WebElement Clearbox=driver.findElementByClassName("username");
		Clearbox.clear();
		
		
		
		
	}

}
