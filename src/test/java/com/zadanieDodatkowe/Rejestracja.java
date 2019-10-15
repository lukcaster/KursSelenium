package com.zadanieDodatkowe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

import static java.lang.System.setProperty;

public class Rejestracja {
    private WebDriver driver;


    String plecMezczyzna ="";
    String plecKobieta = "";
    String firstName ="";
    String lastName ="";
    String email = "";
    String password = "";
    String date = "";
    Random random = new Random();



    @Before
    public void setUp() {
        setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void myStoreRegisterTest (){
        //Przejscie do rejestracji
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        //Plec
        plecMezczyzna = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]/span/input")).getAttribute("value");
        plecKobieta = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[2]/span/input")).getAttribute("value");
        int randomPlec = random.nextInt(2);
        String[] plecMiK = {plecKobieta, plecMezczyzna};
        String plecGenerator = plecMiK[randomPlec];
            if (plecGenerator == plecKobieta) {
                //Plec
                driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[2]/span/input")).click();
                //Imie
                    String[] firstNameKobieta = {"Anna", "Agnieszka", "Kunegunda", "Krystyna", "Eliza", "Elwira"};
                    int randomName = random.nextInt(5);
                    firstName = firstNameKobieta[randomName];
                    WebElement firstNameWeb = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[2]/div[1]/input"));
                    firstNameWeb.sendKeys(firstName);
                    //Nazwisko
                    String[] lastNameKobieta = {"Dymna", "Ruda", "Drwal", "Nowak", "Ryba"};
                    int randomLastName = random.nextInt(4);
                    lastName = lastNameKobieta[randomLastName];
                    WebElement lastNameWeb = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[3]/div[1]/input"));
                    lastNameWeb.sendKeys(lastName);
                    //Email
                    String[] emailKobieta = {"1", "2", "3", "12", "44", "33", "123", "56", "66", "69", "09", "47"};
                    int randomEmailKobieta = random.nextInt(11);
                    email = firstName + lastName + emailKobieta[randomEmailKobieta] + "@gmail.com";
                    WebElement emailWeb = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[4]/div[1]/input"));
                    emailWeb.sendKeys(email);
                    //Haslo
                    password = "Pass123";
                    WebElement passwordWeb = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/input"));
                    passwordWeb.sendKeys(password);
                    //Data
                    String[] dateDay = {"12", "01", "19", "09", "18", "22", "21", "15"};
                    String[] dateMonth = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
                    String[] dateYear = {"1992", "1987", "1965", "1967", "1967"};
                    int randomDateDay = random.nextInt(7);
                    int randomDateMonth = random.nextInt(11);
                    int randomdateYear = random.nextInt(4);
                    date = dateMonth[randomDateMonth] + "/" + dateDay[randomDateDay] + "/" + dateYear[randomdateYear];
                    WebElement dateWeb = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[6]/div[1]/input"));
                    dateWeb.sendKeys(date);
                    //Save
                    driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button")).click();
            }else {
                //Plec
                driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]/span/input")).click();
                //Imie
                String[] firstNameMezczyzna = {"Krzysztof", "Roman", "Jerzy", "Dawid", "Maciek", "Judasz"};
                int randomName = random.nextInt(5);
                firstName = firstNameMezczyzna[randomName];
                WebElement firstNameWeb = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[2]/div[1]/input"));
                firstNameWeb.sendKeys(firstName);
                //Nazwisko
                String[] lastNameMezczyzna = {"Prezes", "Rudy", "Drwal", "Nowak", "Ryba"};
                int randomLastName = random.nextInt(4);
                lastName = lastNameMezczyzna[randomLastName];
                WebElement lastNameWeb = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[3]/div[1]/input"));
                lastNameWeb.sendKeys(lastName);
                //Email
                String[] emailMezczyzna = {"1", "2", "3", "12", "44", "33", "123", "56", "66", "69", "09", "47"};
                int randomEmailMezczyzna = random.nextInt(11);
                email = firstName + lastName + emailMezczyzna[randomEmailMezczyzna] + "@gmail.com";
                WebElement emailWeb = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[4]/div[1]/input"));
                emailWeb.sendKeys(email);
                //Haslo
                password = "Pass123";
                WebElement passwordWeb = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/input"));
                passwordWeb.sendKeys(password);
                //Data
                String[] dateDay = {"12", "01", "19", "09", "18", "22", "21", "15"};
                String[] dateMonth = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
                String[] dateYear = {"1992", "1987", "1965", "1967", "1967"};
                int randomDateDay = random.nextInt(7);
                int randomDateMonth = random.nextInt(11);
                int randomdateYear = random.nextInt(4);
                date = dateMonth[randomDateMonth] + "/" + dateDay[randomDateDay] + "/" + dateYear[randomdateYear];
                WebElement dateWeb = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[6]/div[1]/input"));
                dateWeb.sendKeys(date);
                //Save
                driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button")).click();
            }
            //Asercja
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span")).isEnabled());
            //Przejscie do zmiany danych
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"address-link\"]/span/i")).click();
        //Alias
        WebElement aliasInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input"));
        String[] aliasTabela ={"xXx", "1", "11", "Czamp", "Ja"};
        int randomAlias = random.nextInt(4);
        String alias = aliasTabela[randomAlias];
        aliasInput.sendKeys(firstName + alias);
        //Company
        WebElement companyInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[4]/div[1]/input"));
        String[] companyTabela = {"FedEx", "DHL", "ZUS", "Coders Lab", "Poczta Polska"};
        int randomCompany = random.nextInt(4);
        String company = companyTabela[randomCompany];
        companyInput.sendKeys(company);
        // VAT
        WebElement vatInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[5]/div[1]/input"));
        String[] vatTabela = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int vatRandom = random.nextInt(8);
        String vat = vatTabela[vatRandom] + vatTabela[vatRandom] + vatTabela[vatRandom] + vatTabela[vatRandom] + vatTabela[vatRandom];
        vatInput.sendKeys(vat);
        //Adres ulica
        WebElement addressInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input"));
        String[] addressTabela = {"Piekna", "Sloneczna", "Apteczna", "Dluga", "Krotka", "Szorstka"};
        int addressRandom = random.nextInt(5);
        String address = addressTabela[addressRandom];
        addressInput.sendKeys(address);
        //Adres uzupelnienie
        WebElement addressNumberInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[7]/div[1]/input"));
        String addressNumber = vatTabela[vatRandom] + vatTabela[vatRandom];
        addressNumberInput.sendKeys(addressNumber);
        //City
        WebElement cityInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input"));
        String[] cityTabela = {"Krakow", "Warszawa", "Insbruck", "Gdynia", "Lodz", "Londyn", "Warta"};
        int cityRandom = random.nextInt(6);
        String city = cityTabela[cityRandom];
        cityInput.sendKeys(city);
        //Zip
        WebElement zipInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input"));
        String zip = vatTabela[vatRandom] + vatTabela[vatRandom] + " - " + vatTabela[vatRandom] + vatTabela[vatRandom] + vatTabela[vatRandom];
        zipInput.sendKeys(zip);
        //Country
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select/option[2]")).click();
        //Phone
        WebElement phoneInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input"));
        String phone = "+44" + vatTabela[vatRandom] + vatTabela[vatRandom] + vatTabela[vatRandom] + vatTabela[vatRandom] + vatTabela[vatRandom] + vatTabela[vatRandom] + vatTabela[vatRandom] + vatTabela[vatRandom];
        phoneInput.sendKeys(phone);
        //Save
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button")).click();

        //Assert
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article/ul/li")).isEnabled());

            }
    }




