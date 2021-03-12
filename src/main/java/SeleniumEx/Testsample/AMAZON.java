package SeleniumEx.Testsample;

import org.openqa.selenium.chrome.ChromeDriver;

public class AMAZON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver amazon=new ChromeDriver();
		
		
		amazon.get("https:www.amazon.in");
		amazon.manage().window().maximize();
		amazon.findElementById("twotabsearchtextbox").sendKeys("Redmi Mobiles");
		
		
	}

}
