package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonBrowser;
import constants.Test1_WebInfo;
public class FindNameByID {

	public static void main(String[] args) {
		// lấy trường name theo ID
		CommonBrowser cb = new CommonBrowser();
		WebDriver driver = cb.initChromeDriver("https://automationfc.github.io/basic-form/index.html");
		WebElement divId=  driver.findElement(By.id("name"));
		System.out.println(divId.getAttribute("innerHTML"));
		cb.quitDriver(driver);
	}

}
