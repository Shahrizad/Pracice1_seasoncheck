package com.Turpan.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logInFunctionality
{
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
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

        String expectedValue="Quick Launchpad";

        WebElement head=driver.findElement(By.xpath("//h1[.='Quick Launchpad']"));

        String actualValue=head.getText();

        if (expectedValue.equals(actualValue)){

            System.out.println("test passed, contrats!");
        }else {

            System.out.println("test failed,dumbass!");
        }





    }







}
