package com.wang.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author Stan 
* @version 2020年3月31日 下午11:22:16 
* 
*/

public class TestWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		
		WebElement searchText = firefoxDriver.findElement(By.id("kw"));
		WebElement searchButton = firefoxDriver.findElement(By.id("su"));
		
		
		searchText.sendKeys("hello");
		searchText.clear();
		searchText.sendKeys("hello again");
		searchButton.click();
		
		Thread.sleep(1000 * 5);
		firefoxDriver.quit();
	}
}
