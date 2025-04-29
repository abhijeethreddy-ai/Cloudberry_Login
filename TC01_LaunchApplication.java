package seleniumWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_LaunchApplication {

	public static void main(String[] args) {
		/*
		Test case
		---------
		1) Launch Chrome browser
		2) Open URL: https://cloudberrystore.services/
		3) Validate page title = "Your store of fun"
		4) Close browser
		*/

	//1.) Launch Chrome Browser
		
		ChromeDriver driver = new ChromeDriver(); //Launch Browser
		
	//2.) Open URL : https://cloudberrystore.services/

		driver.get("https://cloudberrystore.services/");
		driver.manage().window().maximize();
		
		//3.) Validate page title = "Your Store of fun"
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Your Store of Fun"))
		{
		System.out.println("Test Passed");	
		}
		else 
		{
		System.out.println("Test Failed");	
		}	
	
		//Close Browser
		driver.quit();
		
	}

}
