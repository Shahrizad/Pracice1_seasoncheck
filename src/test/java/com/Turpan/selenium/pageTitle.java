package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageTitle {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().refresh();

        String expected="Amazon";

        String pageTitle=driver.getTitle();



        if(pageTitle.contains(expected)){

            System.out.println("test passed");
        }else {

            System.out.println("test failed");
        }

        System.out.println(pageTitle);

        Thread.sleep(5000);

        driver.close();



    }
}
