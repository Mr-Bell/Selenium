package Task.Signup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();

//Calling URL
driver.get("http://search.signin.in/Registration.aspx");
driver.manage().window().maximize();

//Create personal details

WebElement email=driver.findElementById("Email");
email.sendKeys("mr.bell1116@gmail.com");
WebElement password=driver.findElementById("Password");
password.sendKeys("mylife@007");
WebElement Confirmpassword=driver.findElementById("Password");
Confirmpassword.sendKeys("mylife@007");
WebElement Name=driver.findElementById("FirstName");
Name.sendKeys("Manikandan");
WebElement Name1=driver.findElementById("LastName");
Name1.sendKeys("K");
WebElement passportno=driver.findElementById("Passport");
passportno.sendKeys("NUMBERS");
WebElement Address=driver.findElementById("Address1");
Address.sendKeys("no 2 manaiblock chennai");
WebElement Address1=driver.findElementById("Address2");
Address1.sendKeys("TAMILNADU");

//Selecting Gender
WebElement Gender=driver.findElementByXPath("/html/body/main/div[1]/form/div[6]/div/div[2]/div/div[3]/div[1]/div[6]/input[1]");
Gender.click();

//DOB
WebElement month=driver.findElementByName("monthDOB");
month.click();
month.sendKeys("MAY");
WebElement date=driver.findElementByName("dayDOB");
date.click();
date.sendKeys("21");
WebElement year=driver.findElementByName("yearDOB");
year.click();
year.sendKeys("2021");


//Selecting Country
WebElement country=driver.findElementByXPath("/html/body/main/div[1]/form/div[6]/div/div[2]/div/div[3]/div[2]/div[4]/select");
country.click();
country.sendKeys("India");
WebElement State=driver.findElementByXPath("/html/body/main/div[1]/form/div[6]/div/div[2]/div/div[3]/div[2]/div[5]/select");
State.click();
State.sendKeys("Tamilnadu");
WebElement city=driver.findElementByXPath("/html/body/main/div[1]/form/div[6]/div/div[2]/div/div[3]/div[2]/div[6]/select");
city.click();
city.sendKeys("Chennai");
WebElement pincode=driver.findElementById("PinCode");
pincode.sendKeys("600001");
WebElement PhNo=driver.findElementById("Mobile");
PhNo.sendKeys("9876543210");

WebElement Sub1=driver.findElementByXPath("/html/body/main/div[1]/form/div[6]/div/div[2]/div/div[3]/div[3]/div/input");
Sub1.click();
WebElement Sub2=driver.findElementByXPath("/html/body/main/div[1]/form/div[6]/div/div[2]/div/div[3]/div[4]/div/input");
Sub2.click();


//Clicking Register now
WebElement now=driver.findElementByXPath("/html/body/main/div[1]/form/div[6]/div/div[2]/div/div[4]/p/a");
now.click();

driver.close();
	}

}
