package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppTest {
    WebDriver browser;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void main(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");


    }

    @BeforeEach
    void login(){
        browser = new ChromeDriver();
        browser.get("https://crm.geekbrains.space/contact/create");
        browser.findElement(By.id("prependedInput")).sendKeys(" Applanatest1");
        browser.findElement(By.xpath("//input[@class='span2' and @placeholder=\"Пароль\"]")).sendKeys("Student2020!");
        browser.findElement(By.name("_submit")).click();
    }
    @Test
    void inputNameCrm(){
        browser.findElement(By.xpath("//input[@name=\"crm_contact[lastName]\"]")).sendKeys("Doe");
        browser.findElement(By.name("crm_contact[firstName]")).sendKeys("John");

        Thread.sleep(50000);
        browser.close();
        browser.quit();
    }

}
