package prog.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Tools\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	   
		  // LoginFlow(driver);
		incorrectPasswordFlow(driver);
		
	}

	public static void LoginFlow(WebDriver driver) {
		driver.get("http://www.phptravels.net/login");
	    driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
	    driver.findElement(By.name("password")).sendKeys("demouser"); 	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	public static void incorrectPasswordFlow(WebDriver driver) throws InterruptedException {
		String expectedErrorMessage ="wrongCredentials,try again!";
		driver.get("http://www.phptravels.net/login");
	    driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
	   driver.findElement(By.name("password")).sendKeys("demo"); 	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(500);
		String wrongCredentialsText =driver.findElement(By.className("alert-danger")).getText();
		System.out.println("wrongCredentialsText");
		Assert.assertEquals(wrongCredentialsText,expectedErrorMessage);

	}
	

}
