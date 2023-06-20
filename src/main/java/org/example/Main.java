package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.Key;

public class Main {
    public static void main(String[] args) {
/*
1) Open The browser
2) Open Url (http://newtours.demoaut.com/)

 */
try {
//        System.setProperty("key","value");you are going to set the System Property only when you are going to use it on personal laptop
    //this will basically set the path of any explorer where its exe files are there


    //This will invoke the browser WebDriver is parent class and there comes FireFox Driver and Chrome Driver
    WebDriver wd = new ChromeDriver();


    //.get() method will going to open the url
    wd.get("https://www.google.com/");
wd.manage().window().maximize();
Thread.sleep(2000);
    //to find the element we will use .findElement(By.name/id/xpath(""))->provide address of the element
    WebElement input = wd.findElement(By.id("APjFqb"));
    //sendkeys->used to entering some text in the text box
    //Keys.ENTER->after entering the text it should press the ENTER for that we will write that
    input.sendKeys("GeeksForGeeks" + Keys.ENTER);
    WebElement m = wd.findElement(By.xpath("/html/body/div[6]/div/div[13]/div/div[1]/div[2]/div/div/div/div/div/div[1]/a/div[2]/span[1]/span[2]/span[2]/span"));
    m.click();
    Thread.sleep(1000);
    WebElement write = wd.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div/div[2]/form/div/div/input"));
    write.sendKeys("Java" + Keys.ENTER);

    Thread.sleep(2000);
    wd.findElement(By.id("header_3")).click();

    Thread.sleep(2000);

    JavascriptExecutor js = (JavascriptExecutor) wd;
    js.executeScript("window.scrollBy(0,250)", "");


}catch (Exception e){
    System.out.println(e);
}

    }
}