package com.wang.day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author Stan 
* @version 2020年3月31日 下午11:22:16 
* 
*/

public class TestOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		
		Options options = firefoxDriver.manage();
		
		
		options.window().fullscreen();
		options.window().setSize(new Dimension(500, 500));
		
		
		
		Thread.sleep(1000 * 5);
		firefoxDriver.quit();
	}
}
