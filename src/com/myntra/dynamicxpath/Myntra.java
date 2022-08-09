package com.myntra.dynamicxpath;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\eclipse-workspace\\Myntra\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");

		List<WebElement> allelements = driver.findElements(
				By.xpath("//img[@class='img-responsive']//following::span[@class='product-discountedPrice']"));

		
		List<WebElement> productname = driver.findElements(By.xpath("//li[@class='product-base']//following-sibling::span[contains(text(),'Rs. ')]//preceding-sibling::span[contains(text(),'Rs. ')]//preceding::h3");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
				for (int i = 0; i < allelements.size(); i++) {
					String price = allelements.get(i).getText().replaceAll("Rs. ", "");
				int originalprice = Integer.parseInt(price);	
				String productname2 = productname.get(i).getText();
					hm.put(originalprice, productname2);
					
					
				}
		
//		for (WebElement webElement : allelements) {
//
//			String price = webElement.getText().replaceAll("Rs. ", "");
//			int originalprice = Integer.parseInt(price);
//			list.add(originalprice);
//		}
//		Integer min = Collections.min(list);
//		System.out.println("The minimum price is:"+ min);
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.sort(list, Collections.reverseOrder());;
//		System.out.println(list);
//		System.out.println("The maximum price is:"+ Collections.max(list));
	}

}
