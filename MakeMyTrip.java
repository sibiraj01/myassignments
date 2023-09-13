package classassesment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximixed","--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		
		
		
//		2.Maximize the window and add wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		3.Load the Url(https://www.tatacliq.com/)
		driver.get("https://www.tatacliq.com/");
		
		
		
		/*
		 * Assignment 2 ========
		 * 
		 * 1. Open the MakeMyTrip website. https://www.makemytrip.com/ 2. Close the
		 * Sweet Alert. 3. Click on the website logo. 4. Navigate to the
		 * "Holiday Packages" section. 5. Input "Chennai" as the departure city. 6.
		 * Select the first suggested city. 7. Specify "Goa" as the destination city. 8.
		 * Choose the first city suggestion. 9. Pick a date from the calendar. 10.
		 * Adjust the number of adults to the maximum allowed. 11. Click on the apply
		 * button. 12. Set the trip duration to 3-5 nights. 13. Click on the apply
		 * button 14. Click on the search button. 15. Skip an automated assistance
		 * prompt. 16. Capture a screenshot of the first vacation package. 17. Print the
		 * current page title. 18. Close the web browser.
		 */
	}

}
