package facebookPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHomePage {
	
	public static void main(String[] args) throws Exception {
		
		// Setting property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launching chrome browser instance
		
		driver.manage().window().maximize(); //Maximizing the window
		driver.get("https://www.facebook.com/"); // Opening Facebook
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ASHU");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getSize());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@id= 'reg_pages_msg']")).getText());
		
	}

}
