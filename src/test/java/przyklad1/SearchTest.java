package przyklad1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import java.util.Random;

import static java.lang.System.*;
import static org.junit.Assert.*;

public class SearchTest {

    private WebDriver driver;
    String[] products = {"mug", "notebook", "cushion", "t-shirt", "sweater"};
    Random random = new Random();
    int randomInteger = random.nextInt(4);
    String produktLos = products[randomInteger];
    String produktId = "";
    String produktIdWeb ="";

    
    @Before
    public void setUp() {
        // Uruchom nowy egzemplarz przeglądarki Chrome
        setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        //driver.manage().window().maximize();
        // Przejdź do Strony coderslab
        driver.get("https://prod-kurs.coderslab.pl");
    }
    @Test
    public void testGoogleSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("s"));
        // Wyczyść teskst zapisany w elemencie
        element.clear();

        // Wpisz informacje do wyszukania
        element.sendKeys(products[randomInteger]);
        element.submit();


        switch (produktLos) {
            case "mug":
                produktId = "Customizable Mug";
                produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                Assert.assertEquals(produktId, produktIdWeb);
                System.out.println("System Dziala dobrze :)");


                break;
            case "notebook":
                produktId = "Mountain Fox Notebook";
                produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                Assert.assertEquals(produktId, produktIdWeb);
                System.out.println("System Dziala dobrze :)");

                break;
            case "cushion":
                produktId = "Mountain Fox Cushion";
                produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                Assert.assertEquals(produktId, produktIdWeb);
                System.out.println("System Dziala dobrze :)");


                break;
            case "t-shirt":
                produktId = "Hummingbird Printed T-shirt";
                produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2")).getText();
                Assert.assertEquals(produktId, produktIdWeb);
                System.out.println("System Dziala dobrze :)");

                break;
            case "sweater":
                produktId = "Hummingbird printed sweater";
                produktIdWeb = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/div[1]/h2")).getText();
                Assert.assertEquals(produktId, produktIdWeb);
                System.out.println("System Dziala dobrze :)");

                break;
        }
    }


    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}