package classassesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Tataclicq {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		1.Lanuch the browser and Handle the Notification
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximixed","--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		
		
		
//		2.Maximize the window and add wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		3.Load the Url(https://www.tatacliq.com/)
		driver.get("https://www.tatacliq.com/");
//		4.MouseHover on Brands
		Actions builder=new Actions(driver);
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brands']"));
		Thread.sleep(3000);
		WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		builder.moveToElement(brand).perform();
		Thread.sleep(3000);
		
		
		
		
//		5.click Watches & Accessories
//		6.Choose the first option from the Brand dispaly
//		7.Select sort by-New Arrivals
//		8.Click Men check box
//		9.Print all price of watches(take only numbers)
//		10.Print the watch price
//		11.click the second loaded res
//		12.Handle the window and Print the price of the watch
//		13.Compare two price and print Both price are equal
//		14.Click Add to Bag
//		15.Check the bag count
//		16.Click the cart bag
//		17.Take snapshot of result 
//		18.Close the open window
//		19.Close the browser




	}

}

