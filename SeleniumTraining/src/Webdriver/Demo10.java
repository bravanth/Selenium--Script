package Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BBravanthBalasubrama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		//String title1 = driver.getTitle();
		//System.out.println(title1);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		String title2 = driver.getTitle();
		if(title1.equals(title2))
		{
			
			System.out.println("title are same");
		}
		else
		{
			System.out.println("Title are not same");
		}*/
		//get window handles will tell how many tabs are present
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		//switch to is a command to switch between tabs/browser
		driver.switchTo().window(tabs.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(tabs.get(0));
		String title1= driver.getTitle();
		System.out.println(title1);
		if (title1.equals(title))
		{
			System.out.println("title are same");
		}
		else
		{
			System.out.println("titles are not same");
		}
		
		
	}

}
