package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BBravanthBalasubrama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		/*driver.findElement(By.linkText("Car Rentals")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);*/
		String underconstitle = 	"Under Construction: Mercury Tours";
		List<WebElement> link = driver.findElements(By.tagName("a"));
		String[] linktext = new String[link.size()];
		//Extract the link text of each link elements
		int i = 0;
		for(WebElement e:link)
		{
			linktext[i] = e.getText();
			i++;
		}
		//test whether each link is working fine or not
		for(String t:linktext)
		{
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(underconstitle))
			{
				System.out.println("\"" + t + "\"" + "\"+ is underconstruction");			}
			else
			{
				System.out.println("\"" + t + "\"" + "\"+ is working");
			}
			driver.navigate().back();
		}
	    /*driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);*/
		/*List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());*/
		
		
		/*for(WebElement e:link)
		{
			String text = e.getText();
			System.out.println(e.getText() 	+ "- " + e.getAttribute("href"));
			//System.out.println(text);
		}*/
		/*if(driver.findElement(By.xpath("//*[@name = 'tripType' and @value = 'roundtrip']")).isSelected());
		{
			driver.findElement(By.xpath("//*[@name = 'tripType' and @value = 'oneway']")).click();
			System.out.println("one way is selected");
			//"//*[@name = 'tripType' and @value = 'roundtrip']"
		}
		
		WebElement dropdown = driver.findElement(By.name("passCount"));
		Select sel = new Select(dropdown);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		for(int i = 0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}
		//1st option
		sel.selectByVisibleText("2");
		Thread.sleep(2000);
		//2nd option
		sel.selectByIndex(2);
		Thread.sleep(2000);
		//3rd option
		sel.selectByValue("1");
		Thread.sleep(2000);
		
		// here complete the code for selecting Acapulco
		
		driver.findElement(By.xpath("//*[@name = 'servClass' and @value = 'Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Bravanth");
		driver.findElement(By.name("passLast0")).sendKeys("Reddy");
		driver.findElement(By.name("creditnumber")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@name = 'ticketLess' and @value = 'checkbox'][1]")).click();
		//driver.findElement(By.xpath("//*[@name = 'ticketLess' and @value = 'checkbox'][2]")).click();
		//two elemetns with same attribute - identified and stored in a variable.
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		for (WebElement e:checkbox)
		{
			e.click();
		}
		// to select the second check box instead of the first one.
		//try selecting the first check box and not the second one.
		for (int i = 1;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		//driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).click();
*/		
		
		
		
	}
	

}

//Assignment1

//Click on all the links present on the home page, and tell which link is working and which link is not working
//print all the links in the console
//print underconstruction - if it working it has to print it is working.
//print both working as well as under construction


