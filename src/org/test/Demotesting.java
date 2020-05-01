package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\mjraja\\Alerts\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement clk1 = driver.findElement(By.xpath("//*[@id=\'OKTab\']/button"));
		clk1.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		WebElement conalert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		conalert.click();
		WebElement clk2 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		clk2.click();
		Alert confirmalert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmalert.dismiss();
		WebElement prompt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		prompt.click();
		WebElement clk3 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		clk3.click();
		Alert promptalert = driver.switchTo().alert();
		Thread.sleep(3000);
		promptalert.sendKeys("mjrt");
		Thread.sleep(3000);
		promptalert.accept();
	}

}
