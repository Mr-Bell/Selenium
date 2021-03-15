package Sample.Code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Calling the URL
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		
		//Clicking the radio Button
		WebElement Radiobutton=driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[6]/a/h5");
		Radiobutton.click();
		
		//Selecting the options
		WebElement javaclass=driver.findElementByXPath("//*[@id=\"yes\"]");
		javaclass.click();
		
		//Checking were is it selected
		WebElement checked=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]");
		WebElement unchecked=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]");
		Boolean Button=checked.isSelected();
		Boolean Buttons=unchecked.isSelected();
		System.out.println(Button);
		System.out.print(Buttons);
		
		//Checking the age
		WebElement Age=driver.findElementByName("age");
		System.out.println(Age);
		
		driver.close();
	}

}
