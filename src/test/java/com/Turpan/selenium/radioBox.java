package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class radioBox {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");

       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



        WebElement green=driver.findElement(By.id("gwt-debug-cwRadioButton-color-green-label"));
        green.click();


        WebElement red=driver.findElement(By.id("gwt-debug-cwRadioButton-color-red-label"));

        red.click();

        if(red.isSelected()!=true){

            System.out.println("test passed");
        }else {

            System.out.println("test failed");
        }
    }
}
