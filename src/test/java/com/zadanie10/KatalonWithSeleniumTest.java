package com.zadanie10;

import org.junit.After;
import org.junit.Assert;
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
        String firstName = "Karol";
        String firstNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[1]/label")).getAttribute("for");
        System.out.println(firstNameLabel + " : " + firstName);
            if (firstNameInputField.isEnabled()){
                firstNameInputField.clear();
                firstNameInputField.sendKeys(firstName);
            }else {
                Assert.fail();
            }
        //Znajdz pole i wpisz nazwisko
        WebElement lastNameInputField = driver.findElement(By.id("last-name"));
            String lastName = "Kowalski";
        String lastNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[2]/label")).getText();
        System.out.println(lastNameLabel + " : " + lastName);
            if (lastNameInputField.isEnabled()){
                lastNameInputField.clear();
                lastNameInputField.sendKeys(lastName);
            }else {
                Assert.fail();
            }
        //Plec

        WebElement genderInputField = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        String genderNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]")).getText();
        System.out.println(genderNameLabel);
            if (genderInputField.isEnabled()){
                genderInputField.click();
            }else {
                Assert.fail();
            }
        //Data
        WebElement dobInputField = driver.findElement(By.id("dob"));
        String dobNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[4]/label")).getText();
        System.out.println(dobNameLabel);
            if (dobInputField.isEnabled()) {
                dobInputField.clear();
                dobInputField.sendKeys("05/22/2010");
            }else{
                Assert.fail();
            }
        //Adres
        WebElement addressInputField = driver.findElement(By.id("address"));
            String adressNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[5]/label")).getText();
            String adressName = "Prosta 51";
            System.out.println(adressNameLabel + " : " + adressName);
            if (addressInputField.isEnabled()){
                addressInputField.clear();
                addressInputField.sendKeys(adressName);
            }else{
                Assert.fail();
            }

        //Email
        WebElement emailInputField = driver.findElement(By.id("email"));
        String emailNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[6]/label")).getText();
        String emailName = "karol.kowalski@mailinator.com";
        System.out.println(emailNameLabel + " : " + emailName);
            if (emailInputField.isEnabled()) {
                emailInputField.clear();
                emailInputField.sendKeys(emailName);
            }else {
                Assert.fail();
            }
        // Password
        WebElement passwordInputField = driver.findElement(By.id("password"));
        String passwordNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[7]/label")).getText();
        String passwordName = "Pass123";
        System.out.println(passwordNameLabel + " : " + passwordName);
            if (passwordInputField.isEnabled()){
                passwordInputField.clear();
                passwordInputField.sendKeys(passwordName);
            }else {
                Assert.fail();
            }

        //Company
        WebElement companyInputField = driver.findElement(By.id("company"));
        String companyNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[7]/label")).getText();
        String companyName = "Coders Lab";
        System.out.println(companyName + " : " + companyNameLabel);
            if (companyInputField.isEnabled()) {
                companyInputField.clear();
                companyInputField.sendKeys(companyName);
            }else {
                Assert.fail();
            }
        //Role
        WebElement roleInputField = driver.findElement(By.xpath("//*[@id=\"role\"]/option[2]"));
        String roleNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[8]/label")).getText();
        String roleName = driver.findElement(By.xpath("//*[@id=\"role\"]/option[2]")).getText();
        System.out.println(roleNameLabel + " : " + roleName);
            if (roleInputField.isEnabled()){
                roleInputField.click();
            } else {
                Assert.fail();
            }
        //Job expectation
        WebElement jobExpectationField = driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[6]"));
        String jobExpectationNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[9]/label")).getText();
        String jobExpectationNameFirst = driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[6]")).getText();
            if (jobExpectationField.isEnabled()){
                jobExpectationField.click();
            }else {
                Assert.fail();
            }
        jobExpectationField = driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[3]"));
        String jobExpectationNameSecond = driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[3]")).getText();
        System.out.println(jobExpectationNameLabel + " : " + jobExpectationNameFirst + " and " + jobExpectationNameSecond);
            if(jobExpectationField.isEnabled()){
                jobExpectationField.click();
            }else {
                Assert.fail();
            }

        //Development
        WebElement developmentField = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[1]/label/input"));
        String developmentNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/label")).getText();
        String developmentNameFirst = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[1]/label")).getText();
            if (developmentField.isEnabled()){
                developmentField.click();
            }else{
                Assert.fail();
            }
        developmentField = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[2]/label/input"));
        String developmentNameSecond = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[2]/label")).getText();
        System.out.println(developmentNameLabel + " : " + developmentNameFirst + " and " + developmentNameSecond);
        if (developmentField.isEnabled()){
            developmentField.click();
        }else{
            Assert.fail();}
        //Komentarz
        WebElement commentInputField = driver.findElement(By.id("comment"));
        String commentNameLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[12]/label")).getText();
        String commentName = "To jest moj pierwszy automat testowy";
        System.out.println(commentNameLabel + " : " + commentName);
        if (commentInputField.isEnabled()){
            commentInputField.clear();
            commentInputField.sendKeys(commentName);
        }else{
            Assert.fail();
        }

        WebElement submit = driver.findElement(By.id("submit"));
        if (submit.isEnabled()){
            submit.click();
        }else {
            Assert.fail();
        }

    }

    @After
        public void tearDown(){

    }
}
