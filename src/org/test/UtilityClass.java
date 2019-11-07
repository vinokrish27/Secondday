package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	static WebDriver driver;
	public static void launch(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-09\\Kiruba\\Vino\\driver\\chromedriver.exe");
		driver= new ChromeDriver();	
	}
	public static void getUrl(String url){
		driver.get(url);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getCrntUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void insert(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void dropDown(WebElement w,int i) {
		Select s=new Select(w);
		s.selectByIndex(i);
	}
	public static void btnClick(WebElement q) {
		q.click();
	}
	public static void quit() {
		driver.quit();

	}
	

}
