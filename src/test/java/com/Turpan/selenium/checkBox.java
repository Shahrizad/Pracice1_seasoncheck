package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class checkBox {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement monday=driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        monday.click();


        WebElement wednesday=driver.findElement(By.id("gwt-debug-cwCheckBox-Wednesday-input"));
        wednesday.click();

        WebElement friday=driver.findElement(By.id("gwt-debug-cwCheckBox-Friday-input"));
        friday.click();

        boolean mondayIsSelect=monday.isSelected();

        if(mondayIsSelect){

            System.out.println("test passed");
        }else {

            System.out.println("test monday failed");
        }


         if (wednesday.isSelected()==true){

            System.out.println("test passed");

        }else {
             System.out.println("test wednesday failed");
         }

        if(friday.isSelected()==true){
            System.out.println("test  passed");
        }else {

            System.out.println("test friday failed");
        }










    }
}
