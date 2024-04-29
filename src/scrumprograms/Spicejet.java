package scrumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Spicejet {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).sendKeys("DEl");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]")).sendKeys("HYD");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
	    Thread.sleep(5000);
	    String month="June";
	    String date="12";
		WebElement monthyear=driver.findElement(By.xpath("//div[@data-testid=\"undefined-month-"+month+"-2024\"]//following-sibling::div[@data-testid=\"undefined-calendar-day-"+date+"\"]"));
		monthyear.click();		
	}
}
