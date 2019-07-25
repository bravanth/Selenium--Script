package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BBravanthBalasubrama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		//driver.navigate().to("www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Performance")).click();
		
		//assignment2
		// after login, how many links are there, get the number of link, get the size of the links and get the text of
		//all the links
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(WebElement e:link)
		{
			String text = e.getText();
			System.out.println(text);
		}
		
		
	}

}
