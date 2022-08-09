package com.myntra.dynamicxpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho_Electronics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\eclipse-workspace\\Myntra\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://meesho.com/smart-watches/pl/0uf28");

		List<WebElement> allelements = driver.findElements(By.xpath("//div[@class='Card__BaseCard-sc-b3n78k-0 lfjhF NewProductCard__CardStyled-sc-j0e7tu-0 hzPSVW NewProductCard__CardStyled-sc-j0e7tu-0 hzPSVW']//following::h5"));
		
		List<WebElement> productname = driver.findElements(By.xpath("//div[@class='Card__BaseCard-sc-b3n78k-0 lfjhF NewProductCard__CardStyled-sc-j0e7tu-0 hzPSVW NewProductCard__CardStyled-sc-j0e7tu-0 hzPSVW']//following::div[@class='Card__BaseCard-sc-b3n78k-0 cXRroa NewProductCard__DetailCard_Desktop-sc-j0e7tu-2 eEBPAI NewProductCard__DetailCard_Desktop-sc-j0e7tu-2 eEBPAI']//child::p[@class='Text__StyledText-sc-oo0kvp-0 cPgaBh NewProductCard__ProductTitle_Desktop-sc-j0e7tu-4 hofZGw NewProductCard__ProductTitle_Desktop-sc-j0e7tu-4 hofZGw']"));
	
	        
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for (int i = 0; i < allelements.size(); i++) {
			String price = allelements.get(i).getText().replaceAll("Rs. ", "");
		int originalprice = Integer.parseInt(price);	
		String productname1 = productname.get(i).getText();
			hm.put(originalprice, productname1);
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
}