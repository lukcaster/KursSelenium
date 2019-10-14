package com.zadanie10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;

public class KatalonWithSeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp(){
        setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }
    @Test
    public void katalonAmazonAMSTest(){
        //Znajdz pole i wpisz imie
        WebElement firstNameInputField = driver.findElement(By.id("first-name"));
        firstNameInputField.clear();
        firstNameInputField.sendKeys("Karol");
        //Znajdz pole i wpisz nazwisko
        WebElement lastNameInputField = driver.findElement(By.id("last-name"));
        lastNameInputField.clear();
        lastNameInputField.sendKeys("Kowalski");
        //Plec
        driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input")).click();
        //Data
        WebElement dobInputField = driver.findElement(By.id("dob"));
        dobInputField.clear();
        dobInputField.sendKeys("05/22/2010");
        //Adres
        WebElement addressInputField = driver.findElement(By.id("address"));
        addressInputField.clear();
        addressInputField.sendKeys("Prosta 51");
        //Email
        WebElement emailInputField = driver.findElement(By.id("email"));
        emailInputField.clear();
        emailInputField.sendKeys("karol.kowalski@mailinator.com");
        // Password
        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.clear();
        passwordInputField.sendKeys("Pass123");
        //Company
        WebElement companyInputField = driver.findElement(By.id("company"));
        companyInputField.clear();
        companyInputField.sendKeys("Coders Lab");
        //Role
        driver.findElement(By.xpath("//*[@id=\"role\"]/option[2]")).click();
        //Job expectation
        driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[3]")).click();
        //Development
        driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[2]/label/input")).click();
        //Komentarz
        WebElement commentInputField = driver.findElement(By.id("comment"));
        commentInputField.clear();
        commentInputField.sendKeys("To jest moj pierwszy automat testowy");
        driver.findElement(By.id("submit")).click();

    }

    @After
    public void tearDown(){

    }
}
