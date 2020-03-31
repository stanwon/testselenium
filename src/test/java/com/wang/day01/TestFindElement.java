package com.wang.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author Stan 
* @version 2020年3月31日 下午11:22:16 
* 
*/

public class TestFindElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		
		//visit baidu
		firefoxDriver.get("https://www.baidu.com");
		
		//test id, name, className, tagName,
		//firefoxDriver.findElement(By.id("virus-2020")).click();
		
		//test linkText, partialLinkText
		firefoxDriver.findElement(By.linkText("抗击肺炎")).click();
		
		//test xpath, cssSeletor
		
		Thread.sleep(1000 * 10);
		firefoxDriver.quit();
	}
}
