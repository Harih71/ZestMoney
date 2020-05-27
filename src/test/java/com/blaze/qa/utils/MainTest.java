package com.blaze.qa.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
//		driver.get("https://www.amazon.in/");
//		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		//Apple iPhone XR (64GB) - Yellow
//		searchbox.sendKeys("iPhone XR (64GB) - Yellow");
//		searchbox.sendKeys(Keys.ENTER);
//		List<WebElement> productnames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//		for (int i = 0; i < productnames.size(); i++) {
//			String productname = productnames.get(i).getText();
//			if(productname.contains("iPhone XR (64GB) - Yellow")) {
//				WebElement searchcontent = driver.findElement(By.xpath("//*[contains(text(),'iPhone XR (64GB) - Yellow')]/ancestor::div[@class='sg-row']/following-sibling::div//span[@class='a-price-whole']"));
//				String price = searchcontent.getText();
//				System.out.println(productname + price);
//		}
//			
//		}
		
		driver.navigate().to("https://www.flipkart.com/");
		
		WebElement loginalert = driver.findElement(By.xpath("//div[@tabindex='-1']//span[text()='Login']/parent::span/following::span[text()='Get access to your Orders, Wishlist and Recommendations']"));
		if(loginalert.isDisplayed()) {
			//div[@tabindex='-1']//span[text()='Login']/parent::span/following::span[text()='Get access to your Orders, Wishlist and Recommendations']/ancestor::div//button
//			driver.findElement(By.xpath("//button[text()='✕  )).click();
			//button[.='✕' ]
		}
		
//		List<WebElement> searchcontent = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/ancestor::div[@class='sg-row']/following-sibling::div//span[@class='a-price-whole']"));
		//*[contains(text(),'iPhone XR (64GB) - Yellow')]/ancestor::div[@class='sg-row']/following-sibling::div//span[@class='a-price-whole']
	
	}

}
