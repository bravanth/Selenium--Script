package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BBravanthBalasubrama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		//act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB).build().perform();
		//assignment, /login->marketplace-> mouseover on pim->click on employee list->using actions scrolldown
		WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
		Action mouseover = act.moveToElement(PIM).build();
		mouseover.perform();
		PIM.click();
		act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();

		
//		Thread.sleep(3000);
//		driver.navigate().back();
		
	
		
		/*WebElement button = driver.findElement(By.id("btnLogin"));
		Actions act = new Actions(driver);
		Action mouseover = act.moveToElement(button).build();
		mouseover.perform();*/
	}

}
