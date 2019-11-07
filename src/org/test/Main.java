package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main extends UtilityClass{
	
	public static void main(String[] args) {
	launch();
	getUrl("https://www.facebook.com/");
	getCrntUrl();
	getTitle();
	WebElement email=driver.findElement(By.id("email"));
	insert(email, "vinokrish2410@gmail.com");
	WebElement pass=driver.findElement(By.id("pass"));
	insert(pass, "Rithvik@2710");
	WebElement drop=driver.findElement(By.id("month"));
	dropDown(drop, 10);
	WebElement btn=driver.findElement(By.id("loginbutton"));
	btnClick(btn);
	quit();
	}
}
