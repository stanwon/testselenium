package com.wang.day01;

import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* 
* @author Stan 
* @version 2020��3��31�� ����10:12:38 
* 
*/

public class OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		
		
		firefoxDriver.get("https://www.baidu.com");
		
		Thread.sleep(1000 * 5);
		firefoxDriver.quit();
	}
}
