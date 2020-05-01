package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbibank {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\mjraja\\Alerts\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://retail.onlinesbi.com/retail/login.htm");
driver.manage().window().maximize();
WebElement conlogin = driver.findElement(By.xpath("//*[@id=\'banner\']/div[2]/a"));
conlogin.click();
WebElement login = driver.findElement(By.xpath("//*[@id=\'Button2\']"));
login.click();
Alert alert = driver.switchTo().alert();
Thread.sleep(3000);
alert.accept();
	}

}
