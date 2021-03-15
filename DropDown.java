package Sample.Code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Calling the URL
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		
		//Clicking DropDown
		WebElement Dropdown=driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/h5");
		Dropdown.click();
		
		//Selecting the options
		WebElement dropdown1=driver.findElementById("dropdown1");
		dropdown1.sendKeys("Selenium");
		
		
		//Using Select class
		Select select=new Select(dropdown1);
		select.selectByIndex(1);
		select.selectByValue("0");
		select.selectByVisibleText("Selenium");
		
		//Listing the options
		List<WebElement> listoption=select.getOptions();
		int size=listoption.size();
		System.out.println(size);
		
		driver.close();
	}

}
