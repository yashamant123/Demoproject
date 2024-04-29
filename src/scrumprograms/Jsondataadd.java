package scrumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Jsondataadd {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
		driver.findElement(By.xpath("//*[text()='Table Data']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id='jsondata']")).clear();
		String jsondata="[{\"name\" : \"srikar\", \"age\" : 27},{\"name\": \"vasant\", \"age\" : 27},{\"name\" : \"jayesh\", \"age\" : 47}, {\"name\": \"yashmant\", \"age\" : 18},{\"name\" : \"tirumala\", \"age\" : 27}, {\"name\": \"ankita\", \"age\" : 26},{\"name\" : \"kavita\", \"age\" : 27},{\"name\": \"debrati\", \"age\" : 27}]";
		driver.findElement(By.xpath("//textarea[@id='jsondata']")).sendKeys(jsondata);
		driver.findElement(By.xpath("//button[@id='refreshtable']")).click();
		

	}

}
