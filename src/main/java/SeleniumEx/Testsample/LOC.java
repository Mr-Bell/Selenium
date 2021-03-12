package SeleniumEx.Testsample;

import org.openqa.selenium.chrome.ChromeDriver;

public class LOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://testleaf.herokuapp.com/");
driver.manage().window().maximize();
driver.findElementByLinkText("Edit").click();
driver.findElementById("email").sendKeys("mr.bell16@gmail.com");
 
	}

}
