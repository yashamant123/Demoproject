package scrumprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Patientzone_srikar {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.patientzone.co.uk/app/reg-end-user");
		Thread.sleep(5000);
		ArrayList<String> key=new ArrayList<>();
		String  name=driver.findElement(By.xpath("//span[@class='ng-tns-c77-2 ng-star-inserted']")).getText();
		Thread.sleep(2000);
		for(int i=3;i<=23;i++) {
			if(i%2!=0) {
				Thread.sleep(2000);
				String other=driver.findElement(By.xpath("//label[@id='mat-form-field-label-"+i+"']")).getText();
				key.add(other);
				//System.out.println(other);
			}
		}
		ArrayList<String> value1=new ArrayList<>(Arrays.asList("jhon","kumar",
				"gouda","5/2/2024","jhon@gmail.com","123456789","LBnagar","srnagar","Ameerpet","hyderbad","123445"));
		for(int i=0;i<=4;i++) {
			Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mat-input-"+i+"']")).sendKeys(value1.get(i));
		}
		int l=6;
		for(int i=5;i<=9;i++) {
			Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mat-input-"+i+"']")).sendKeys(value1.get(l));
		l++;
		}
		
		HashMap<String, String> map= new HashMap<>();
		for(int i=0;i<key.size();i++) {
			map.put(key.get(i),value1.get(i) );
		}	
		System.out.println(map);
	}
}