package Sample.Code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Calling the URL
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		
		//Clicking the box
		WebElement Checkbox=driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a/h5");
        Checkbox.click();	
        
        //Selecting the Java box
        WebElement java=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/input[1]");
	    java.click();
	    
	    //Checking Selenum is selected
	    WebElement selenium=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/input");
	    boolean seleniumcheckbox=selenium.isSelected();
	    System.out.println(seleniumcheckbox);
	
	    //Checking Options are selected or not
	    WebElement option1=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/input[1]");
        if (option1.isSelected())	
        {
	    option1.click();
        }
        else {
     	System.out.println("option1 is not selected");
        }
        
        WebElement option2=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/input[2]");
        if (option2.isSelected())
        		{
        	option2.click();
        		}
        else
        {
        System.out.println("option2 is not selected");	
        }
        
        driver.close();


	}

}
