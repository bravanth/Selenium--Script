package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BBravanthBalasubrama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("userName")).sendKeys("sunil");
		/*driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(30000);
		driver.close();*/
		WebElement UN = driver.findElement(By.name("userName"));
		if(UN.isEnabled())
		{
			UN.sendKeys("sunil");
			Thread.sleep(3000);
			UN.clear();
			UN.sendKeys("sunil");
		}
		if(driver.findElement(By.name("userName")).isDisplayed())
		{
			//get the username and print the username in the console.
			//System.out.println(UN.getAttribute("value"));
			String name = UN.getAttribute("value");
			System.out.println("this will get the attribute of the value---->" + name);
			String name1 = UN.getAttribute("name");
			driver.findElement(By.name(name1)).clear();
			System.out.println("this will fetch the attribute of name----->" + name1);
			//get text can be used for label and can also be used for dropdown
			String label1 = driver.findElement(By.xpath("//*[contains(text(),'User')]")).getText();
			System.out.println(label1);
			
			
			
		}

	}

}
