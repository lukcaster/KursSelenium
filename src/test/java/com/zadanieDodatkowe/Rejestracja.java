package com.zadanieDodatkowe;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class Rejestracja {
    private WebDriver driver;


    String plecMezczyzna = "";
    String plecKobieta = "";
    String firstName = "";
    String lastName = "";
    String email = "";
    String password = "";
    String date = "";
    Random random = new Random();
    String cena1 = "";
    String cena2 = "";



    @Before
    public void setUp() {
        setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void myStoreRegisterTest() throws InterruptedException {
        //Przejscie do rejestracji
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        //Plec
        String plecMezczyzna = "2";
        String plecKobieta = "1";
        int randomPlec = random.nextInt(1);
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
            String[] emailKobietaNumer1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            int randomEmailKobieta = random.nextInt(10);
            String[] emailKobietaNumer2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            int randomEmailKobieta2 = random.nextInt(10);
            String[] emailKobietaNumer3 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            int randomEmailKobieta3 = random.nextInt(10);
            email = firstName + lastName + emailKobietaNumer1[randomEmailKobieta] + emailKobietaNumer2[randomEmailKobieta2] +  emailKobietaNumer3[randomEmailKobieta3] + "@gmail.com";
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
        } else {
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
            String[] emailMezczyznaNumer1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            int randomEmailMezczyzna = random.nextInt(10);
            String[] emailMezczyznaNumer2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            int randomEmailMezczyzna2 = random.nextInt(10);
            String[] emailMezczyznaNumer3 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            int randomEmailMezczyzna3 = random.nextInt(10);
            email = firstName + lastName + emailMezczyznaNumer1[randomEmailMezczyzna] + emailMezczyznaNumer2[randomEmailMezczyzna2] +  emailMezczyznaNumer3[randomEmailMezczyzna3] + "@gmail.com";

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
        String[] aliasTabela = {"xXx", "1", "11", "Czamp", "Ja"};
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
        String[] phoneTabela = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int phoneRandom = random.nextInt(8);
        String[] addressNumberTabela = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int addressNumberRandom = random.nextInt(8);
        String[] zipTabela = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int zipRandom = random.nextInt(8);
        String vat1 = vatTabela[vatRandom];
        String vat2 = phoneTabela[phoneRandom];
        String vat3 = addressNumberTabela[addressNumberRandom];
        String vat4 = zipTabela[zipRandom];
        String vat = vat1 + vat3 + vat2 + vat1 + vat4 + vat2 + vat3 + vat4 + vat3;
        vatInput.sendKeys(vat);
        //Adres ulica
        WebElement addressInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input"));
        String[] addressTabela = {"Piekna", "Sloneczna", "Apteczna", "Dluga", "Krotka", "Szorstka"};
        int addressRandom = random.nextInt(5);
        String address = addressTabela[addressRandom];
        addressInput.sendKeys(address);
        //Adres uzupelnienie
        WebElement addressNumberInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[7]/div[1]/input"));
        String addressNumber = vat1 + vat2 + " / " + vat4 + vat3;
        addressNumberInput.sendKeys(addressNumber);
        //City
        WebElement cityInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input"));
        String[] cityTabela = {"Krakow", "Warszawa", "Insbruck", "Gdynia", "Lodz", "Londyn", "Warta"};
        int cityRandom = random.nextInt(6);
        String city = cityTabela[cityRandom];
        cityInput.sendKeys(city);
        //Zip
        WebElement zipInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input"));
        String zip = vat1 + vat3 + " - " + vat4 + vat2 + vat4;
        zipInput.sendKeys(zip);
        //Country
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select/option[2]")).click();
        //Phone
        WebElement phoneInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input"));
        String phone = "+44" + vat;
        phoneInput.sendKeys(phone);
        //Save
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button")).click();

        //Assert
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article/ul/li")).isEnabled());

        String[] products = {"mug", "notebook", "cushion", "t-shirt", "sweater"};
        Random random = new Random();
        int randomProducts = random.nextInt(4);
        String produktLos = products[randomProducts];
        String produktId = "";
        String produktIdWeb = "";


        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("s"));
        // Wyczyść teskst zapisany w elemencie
        element.clear();

        // Wpisz informacje do wyszukania
        element.sendKeys(products[randomProducts]);
        element.submit();


        switch (produktLos) {
            case "mug":
                produktId = "Customizable Mug";
                produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                Assert.assertEquals(produktId, produktIdWeb);
                String[] mugTabela = {"1", "2", "3", "4", "5"};
                int mugRandom = random.nextInt(4);
                String mug = mugTabela[mugRandom];
                switch (mug) {
                    case "1":
                        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/a/img")).click();
                        WebElement mugCustomization = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[2]/section/div/form/ul/li/textarea"));
                        mugCustomization.sendKeys(firstName + alias);
                        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[2]/section/div/form/div/button")).click();
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        WebElement mugAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        if (mugAssert.isEnabled()) {
                            cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                            mugAssert.click();
                            Thread.sleep(3000);
                            WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));


                            if (continueShopping.isDisplayed()) {
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            } else {
                                Assert.fail();
                            }

                        } else {
                            Assert.fail();
                        }
                        break;


                    case "2":
                        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a/img")).click();
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        mugAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        if (mugAssert.isEnabled()) {
                            cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                            mugAssert.click();
                            Thread.sleep(3000);
                            WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                            if (continueShopping.isDisplayed()) {
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            } else {
                                Assert.fail();
                            }
                        } else {
                            Assert.fail();
                        }
                        break;
                    case "3":
                        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[3]/div/a/img")).click();
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        mugAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        if (mugAssert.isEnabled()) {
                            cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                            mugAssert.click();
                            Thread.sleep(3000);
                            WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                            if (continueShopping.isDisplayed()) {
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            } else {
                                Assert.fail();
                            }
                        } else {
                            Assert.fail();
                        }
                        break;
                    case "4":
                        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[4]/div/a/img")).click();
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        mugAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        if (mugAssert.isEnabled()) {
                            cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                            mugAssert.click();
                            Thread.sleep(3000);
                            WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                            if (continueShopping.isDisplayed()) {
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            } else {
                                Assert.fail();
                            }
                        } else {
                            Assert.fail();
                        }
                        break;
                    case "5":
                        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[5]/div/a/img")).click();
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        mugAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        if (mugAssert.isEnabled()) {
                            cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                            mugAssert.click();
                            Thread.sleep(3000);
                            WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                            if (continueShopping.isDisplayed()) {
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            } else {
                                Assert.fail();
                            }
                        } else {
                            Assert.fail();
                        }
                        break;
                }
                break;


            case "notebook":
                produktId = "Mountain Fox Notebook";
                produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                Assert.assertEquals(produktId, produktIdWeb);
                String[] notebookTabela = {"1", "2", "3",};
                int notebookRandom = random.nextInt(2);
                String notebook = notebookTabela[notebookRandom];

                switch (notebook) {
                    case "1":
                        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/a/img")).click();
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        driver.findElement(By.xpath("//*[@id=\"group_4\"]/option[3]")).click();

                        WebElement notebookAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        if (notebookAssert.isDisplayed()) {
                            notebookAssert.click();
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                            Thread.sleep(3000);
                            WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                            if (continueShopping.isEnabled()) {
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            } else {
                                Assert.fail();
                            }
                        } else {
                            Assert.fail();
                        }
                        break;
                    case "2":
                        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a/img")).click();
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        driver.findElement(By.xpath("//*[@id=\"group_4\"]/option[2]")).click();
                        notebookAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        if (notebookAssert.isEnabled()) {
                            notebookAssert.click();
                            driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                            Thread.sleep(3000);
                            WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                            if (continueShopping.isDisplayed()) {
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            } else {
                                Assert.fail();
                            }
                        } else {
                            Assert.fail();
                        }
                        break;

                    case "3":
                        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[3]/div/a/img")).click();
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        driver.findElement(By.xpath("//*[@id=\"group_4\"]/option[4]")).click();

                        notebookAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        if (notebookAssert.isEnabled()) {
                            notebookAssert.click();
                            driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                            Thread.sleep(3000);
                            WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                            if (continueShopping.isDisplayed()) {
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                            } else {
                                Assert.fail();
                            }
                        } else {
                            Assert.fail();
                        }
                }
                break;

            case "cushion":
                produktId = "Mountain Fox Cushion";
                produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                Assert.assertEquals(produktId, produktIdWeb);
                String[] cushionTabela = {"1", "2", "3",};
                int cushionRandom = random.nextInt(2);
                String cushion = cushionTabela[cushionRandom];
            case "1":
                driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/a/img")).click();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                WebElement cushionAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                if (cushionAssert.isEnabled()) {
                    cushionAssert.click();
                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                    cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                    Thread.sleep(3000);
                    WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                    if (continueShopping.isDisplayed()) {
                        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                    } else {
                        Assert.fail();
                    }
                } else {
                    Assert.fail();
                }
                break;
            case "2":
                driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a/img")).click();
                driver.findElement(By.xpath("//*[@id=\"group_4\"]/option[3]")).click();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                cushionAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                if (cushionAssert.isEnabled()) {
                    cushionAssert.click();
                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                    cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                    Thread.sleep(3000);
                    WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                    if (continueShopping.isDisplayed()) {
                        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                    } else {
                        Assert.fail();
                    }
                } else {
                    Assert.fail();
                }
                break;

            case "3":
                driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[3]/div/a/img")).click();
                driver.findElement(By.xpath("//*[@id=\"group_4\"]/option[3]")).click();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                cushionAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                if (cushionAssert.isEnabled()) {
                    cushionAssert.click();
                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                    cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                    driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));
                    Thread.sleep(3000);
                    WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button"));

                    if (continueShopping.isDisplayed()) {

                        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                    } else {
                        Assert.fail();
                    }
                } else {
                    Assert.fail();
                }
                break;


            case "t-shirt":
                produktId = "Hummingbird Printed T-shirt";
                produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                Assert.assertEquals(produktId, produktIdWeb);
                driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/a/img")).click();
                driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]")).click();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[1]")).getText();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                WebElement tshirtAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                    Assert.assertTrue(tshirtAssert.isEnabled());

                    Thread.sleep(3000);
                    WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));


                    if (continueShopping.isDisplayed()) {
                        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                    } else {
                        Assert.fail();
                    }





                break;
            case "sweater":
                produktId = "Hummingbird printed sweater";
                produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/div[1]/h2")).getText();
                Assert.assertEquals(produktId, produktIdWeb);
                driver.findElement(By.xpath("///*[@id=\"js-product-list\"]/div[1]/article/div/a/img")).click();
                driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]")).click();
                cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[1]")).getText();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                WebElement sweaterAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                Assert.assertTrue(sweaterAssert.isEnabled());
                Thread.sleep(3000);
                continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                if (continueShopping.isDisplayed()) {
                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                } else {
                    Assert.fail();
                }
                break;
        }



            // Znajdź element wprowadzania tekstu na podstawie jego nazwy

            element = driver.findElement(By.name("s"));
            // Wyczyść teskst zapisany w elemencie
            element.clear();

            // Wpisz informacje do wyszukania
            element.sendKeys(products[randomProducts]);
            element.submit();


            switch (produktLos) {
                case "mug":
                    produktId = "Customizable Mug";
                    produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                    Assert.assertEquals(produktId, produktIdWeb);
                    String[] mugTabela = new String[]{"1", "2", "3", "4", "5"};
                    int mugRandom = random.nextInt(4);
                    String mug = mugTabela[mugRandom];
                    switch (mug) {
                        case "1":
                            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/a/img")).click();
                            WebElement mugCustomization = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[2]/section/div/form/ul/li/textarea"));
                            mugCustomization.sendKeys(firstName + alias);
                            driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[2]/section/div/form/div/button")).click();
                            WebElement mugAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            if (mugAssert.isEnabled()) {
                                cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                                mugAssert.click();
                                Thread.sleep(3000);
                                WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));


                                if (continueShopping.isDisplayed()) {
                                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                                } else {
                                    Assert.fail();
                                }

                            } else {
                                Assert.fail();
                            }
                            break;


                        case "2":
                            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a/img")).click();
                            mugAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            if (mugAssert.isEnabled()) {
                                cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                                mugAssert.click();
                                Thread.sleep(3000);
                                WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                                if (continueShopping.isDisplayed()) {
                                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                                } else {
                                    Assert.fail();
                                }
                            } else {
                                Assert.fail();
                            }
                            break;
                        case "3":
                            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[3]/div/a/img")).click();
                            mugAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            if (mugAssert.isEnabled()) {
                                cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                                mugAssert.click();
                                Thread.sleep(3000);
                                WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                                if (continueShopping.isDisplayed()) {
                                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                                } else {
                                    Assert.fail();
                                }
                            } else {
                                Assert.fail();
                            }
                            break;
                        case "4":
                            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[4]/div/a/img")).click();
                            mugAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            if (mugAssert.isEnabled()) {
                                cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                                mugAssert.click();
                                Thread.sleep(3000);
                                WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                                if (continueShopping.isDisplayed()) {
                                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                                } else {
                                    Assert.fail();
                                }
                            } else {
                                Assert.fail();
                            }
                            break;
                        case "5":
                            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[5]/div/a/img")).click();
                            mugAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            if (mugAssert.isEnabled()) {
                                cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                                mugAssert.click();
                                Thread.sleep(3000);
                                WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                                if (continueShopping.isDisplayed()) {
                                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                                } else {
                                    Assert.fail();
                                }
                            } else {
                                Assert.fail();
                            }
                            break;
                    }
                    break;


                case "notebook":
                    produktId = "Mountain Fox Notebook";
                    produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                    Assert.assertEquals(produktId, produktIdWeb);
                    String[] notebookTabela = new String[]{"1", "2", "3",};
                    int notebookRandom = random.nextInt(2);
                    String notebook = notebookTabela[notebookRandom];

                    switch (notebook) {
                        case "1":
                            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/a/img")).click();
                            driver.findElement(By.xpath("//*[@id=\"group_4\"]/option[3]")).click();
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            WebElement notebookAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                            if (notebookAssert.isEnabled()) {
                                notebookAssert.click();
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                                cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                                Thread.sleep(3000);
                                WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                                if (continueShopping.isDisplayed()) {
                                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                                } else {
                                    Assert.fail();
                                }
                            } else {
                                Assert.fail();
                            }
                            break;
                        case "2":
                            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a/img")).click();
                            driver.findElement(By.xpath("//*[@id=\"group_4\"]/option[2]")).click();
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            notebookAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            if (notebookAssert.isEnabled()) {
                                notebookAssert.click();
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                                cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                                Thread.sleep(3000);
                                WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                                if (continueShopping.isDisplayed()) {
                                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                                } else {
                                    Assert.fail();
                                }
                            } else {
                                Assert.fail();
                            }
                            break;

                        case "3":
                            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[3]/div/a/img")).click();
                            driver.findElement(By.xpath("//*[@id=\"group_4\"]/option[4]")).click();
                            notebookAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            if (notebookAssert.isEnabled()) {
                                notebookAssert.click();
                                driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                                cena1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                                Thread.sleep(3000);
                                WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                                if (continueShopping.isDisplayed()) {
                                    driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                                } else {
                                    Assert.fail();
                                }
                            } else {
                                Assert.fail();
                            }
                    }
                    break;

                case "cushion":
                    produktId = "Mountain Fox Cushion";
                    produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                    Assert.assertEquals(produktId, produktIdWeb);
                    String[] cushionTabela = new String[]{"1", "2", "3",};
                    int cushionRandom = random.nextInt(2);
                    String cushion = cushionTabela[cushionRandom];
                case "1":
                    driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/a/img")).click();
                    WebElement cushionAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    if (cushionAssert.isEnabled()) {
                        cushionAssert.click();
                        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                        cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                        Thread.sleep(3000);
                        WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]/i"));

                        if (continueShopping.isDisplayed()) {
                            driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                        } else {
                            Assert.fail();
                        }
                    } else {
                        Assert.fail();
                    }
                    break;
                case "2":
                    driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a/img")).click();
                    driver.findElement(By.xpath("//*[@id=\"group_4\"]/option[3]")).click();
                    cushionAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    if (cushionAssert.isEnabled()) {
                        cushionAssert.click();
                        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                        cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                        Thread.sleep(3000);
                        WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                        if (continueShopping.isDisplayed()) {
                            driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                        } else {
                            Assert.fail();
                        }
                    } else {
                        Assert.fail();
                    }
                    break;

                case "3":
                    driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[3]/div/a/img")).click();
                    driver.findElement(By.xpath("//*[@id=\"group_4\"]/option[3]")).click();
                    cushionAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    if (cushionAssert.isEnabled()) {
                        cushionAssert.click();
                        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button")).click();
                        cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/div/span")).getText();
                        driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));
                        Thread.sleep(3000);
                        WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/button"));

                        if (continueShopping.isDisplayed()) {

                            driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                        } else {
                            Assert.fail();
                        }
                    } else {
                        Assert.fail();
                    }
                    break;


                case "t-shirt":
                    produktId = "Hummingbird Printed T-shirt";
                    produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                    Assert.assertEquals(produktId, produktIdWeb);
                    driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/a/img")).click();
                    driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]")).click();
                    cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[1]")).getText();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    WebElement tshirtAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                    Assert.assertTrue(tshirtAssert.isEnabled());
                    Thread.sleep(3000);
                    WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                    if (continueShopping.isDisplayed()) {
                        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                    } else {
                        Assert.fail();
                    }

                    break;
                case "sweater":
                    produktId = "Hummingbird printed sweater";
                    produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/div[1]/h2")).getText();
                    Assert.assertEquals(produktId, produktIdWeb);
                    driver.findElement(By.xpath("///*[@id=\"js-product-list\"]/div[1]/article/div/a/img")).click();
                    driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]")).click();
                    cena2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[1]")).getText();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    WebElement sweaterAssert = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
                    Assert.assertTrue(sweaterAssert.isEnabled());
                    Thread.sleep(3000);
                    continueShopping = driver.findElement(By.xpath("//*[@id=\"myModalLabel\"]"));

                    if (continueShopping.isDisplayed()) {
                        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
                    } else {
                        Assert.fail();
                    }
                    break;
            }
                String sumaCen = "";
                sumaCen = driver.findElement(By.xpath("//*[@id=\"cart-subtotal-products\"]/span[2]")).getText();
                System.out.println(cena1 + " + " + cena2 + " = " + sumaCen);
            }




    @After
    public void tearDown() {

    }
}








