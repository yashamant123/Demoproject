package scrumprograms1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Tool_tips {
	static String url="https://demoqa.com/tool-tips";

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		String acturl=driver.getCurrentUrl();
		System.out.println(acturl);
		if(acturl.equals(url)) {
		System.out.println("redirected  correct url");	
		}
		else {
			System.out.println("redirected worng url");
		}
		WebElement element=driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		WebElement element2=driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		String tipsvalue=element.getAttribute("title");
		String tipsvalue2=element2.getAttribute("title");
		Actions action = new Actions(driver);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(2000);
		action.moveToElement(element).click().perform();
		Thread.sleep(5000);
		action.moveToElement(element2).build().perform();
	}

}
