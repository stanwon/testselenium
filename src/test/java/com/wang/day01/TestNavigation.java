package com.wang.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author Stan 
* @version 2020年3月31日 下午11:22:16 
* 
*/

public class TestNavigation {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		
		firefoxDriver.findElement(By.linkText("抗击肺炎"));
		
		Navigation navigation = firefoxDriver.navigate();
		navigation.back();
		navigation.forward();
		navigation.refresh();
		
		
		Thread.sleep(1000 * 5);
		firefoxDriver.quit();
	}
}
