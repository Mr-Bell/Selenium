package Sample.Code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Calling the URL
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		//initiating the email ID
		WebElement email= driver.findElementById("email");
		email.sendKeys("mr.bell116@gmail.com");
		
		//append text
		WebElement append =driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");
		append.sendKeys("Welcome");
		
		//box text
	    WebElement Textbox=driver.findElementByName("username");
		String value=Textbox.getAttribute("value");
	    System.out.println("value"+value);
		
	    //clear text
		WebElement Clearbox=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input");
		Clearbox.clear();
		
		driver.close();
	}

}
