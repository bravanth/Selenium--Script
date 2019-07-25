package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException
	{
		//set the chrome driver properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BBravanthBalasubrama\\Downloads\\chromedriver_win32\\chromedriver.exe");
				//open the new instance of browsers.
		
		WebDriver driver = new ChromeDriver();
		
		//this will open the browser but supports only chrome version
		//ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\BBravanthBalasubrama\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//how to open a browser.
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		//String Expectedtitle = driver.getTitle();
		//System.out.println(Expectedtitle);
		String Expectedtitle = "OrangeHRM";
		
		//enter the username using sendkey
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnlogin")).click();
		Thread.sleep(30000);
		String ActualTitle = driver.getTitle();
		if(Expectedtitle.equals(ActualTitle))
		{
			//Code for logout
			System.out.println("if the title is same then do logout");

			driver.findElement(By.id("welcome")).click();
			//just an option at present
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			//will close the active browser instance
			driver.close();
			// for closing multiple browser
			//driver.quit();
			
					}
		else
		{
			System.out.println("Expected is not equal to actual");
		}
	}

}
