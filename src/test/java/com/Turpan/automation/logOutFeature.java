package com.Turpan.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class logOutFeature {

    public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://qa2.vytrack.com/user/login");
        WebElement userName=driver.findElement(By.id("prependedInput"));

        userName.sendKeys("user187");

        WebElement passWord=driver.findElement(By.id("prependedInput2"));
        passWord.sendKeys("UserUser123");

        WebElement logIn=driver.findElement(By.id("_submit"));
        logIn.click();

        String pageTitle=driver.getTitle();
        if (pageTitle.equalsIgnoreCase("Dashboard")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

       WebElement triangle=driver.findElement(By.xpath("//i[@class='fa-caret-down']"));


        Actions actions=new Actions(driver);
        actions.moveToElement(triangle).click().perform();

        WebElement logOut=driver.findElement(By.xpath("//a[.='Logout']"));
        logOut.click();


        Thread.sleep(5000);
        driver.close();

    }

}
