package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectionClass {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();



        driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
      //  driver.manage().window().fullscreen();

        WebElement firstName=driver.findElement(By.name("firstName"));

        firstName.sendKeys("ajsh");

        WebElement lastName=driver.findElement(By.name("lastName"));
        lastName.sendKeys("tester");

        WebElement phone=driver.findElement(By.name("phone"));
        phone.sendKeys("0000000000");

        WebElement email=driver.findElement(By.id("userName"));
        email.sendKeys("xxxx@test.com");

        WebElement Address=driver.findElement(By.name("address1"));
        Address.sendKeys("123 fake address");

        WebElement City=driver.findElement(By.name("city"));
        City.sendKeys("Fairfax");

     //   WebElement ilan=driver.findElement(By.id("closeBtn"));

//        Actions actions=new Actions(driver);
//        actions.moveToElement(ilan).click().perform();

        WebElement State=driver.findElement(By.name("state"));
        State.sendKeys("VA");

        WebElement PostalCode=driver.findElement(By.name("postalCode"));
        PostalCode.sendKeys("00000");


        Select select=new Select(driver.findElement(By.name("country")));

        select.selectByVisibleText("UZBEKISTAN");
//        select.selectByIndex(0);
//        select.getFirstSelectedOption();

        WebElement UserName=driver.findElement(By.name("email"));
        UserName.sendKeys("Tester1");
        WebElement Password=driver.findElement(By.name("password"));

        String password="Password123!";
        Password.sendKeys(password);
        WebElement ConfirmPassword=driver.findElement(By.name("confirmPassword"));
        ConfirmPassword.sendKeys(password);

        WebElement Submit=driver.findElement(By.name("submit"));
        Submit.click();










    }

}
