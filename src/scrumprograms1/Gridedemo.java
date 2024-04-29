package scrumprograms1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gridedemo {
	//static String nodeurl="http://192.168.0.53:14436/wd/hub";
	static String huburl="http://192.168.0.53:4444";
     
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//		ChromeOptions options = new ChromeOptions();
//	      options.addArguments("--remote-allow-origins=*");
	      
	      DesiredCapabilities cap=new DesiredCapabilities();
	      cap.setBrowserName("chrome");
	      cap.setPlatform(Platform.WINDOWS);
	      
         RemoteWebDriver  driver=new RemoteWebDriver(new URL(huburl),cap);
          driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge!@#123");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
          
	}

}

