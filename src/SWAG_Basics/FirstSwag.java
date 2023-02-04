package SWAG_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FirstSwag {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	String username = "standard_user";
	String password =  "secret_sauce";
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	Thread.sleep(2000);
	String actualtitle =  driver.getTitle();
	String expectedtitle = "Swag Labs";
//	if(actualtitle == expectedtitle) {
//		System.out.println("successfully paased ^_^");
//	}else {
//		System.out.println("failed try again"); //*[@id="add-to-cart-sauce-labs-backpack"]
//	}
	//Assert.assertEquals(actualtitle, expectedtitle);
	int expectuedelements= 6;
	
	List<WebElement>myelements = driver.findElements(By.className("btn"));	
	for(int i = 0 ; i< myelements.size();i++) {
		myelements.get(i).click();
	}
	
	String acutalElements =driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
	int realResult = Integer.parseInt(acutalElements);
	Assert.assertEquals(realResult, expectuedelements);
System.out.println(acutalElements);
	}
	}



