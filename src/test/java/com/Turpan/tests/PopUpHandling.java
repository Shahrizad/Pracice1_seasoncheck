package com.Turpan.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {
    public static void main( String[] args){


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");

        WebElement UserName=driver.findElement(By.xpath("//input[@name='cusid']"));
        UserName.sendKeys("me"+ Keys.ENTER);

        Alert alert=driver.switchTo().alert();

        alert.accept();
        alert.accept();
       // alert.dismiss();




    }





}
