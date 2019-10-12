package przyklad1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import java.util.Random;

public class SearchTest {

    private WebDriver driver;
    String[] products = {"mug", "notebook", "cushion", "t-shirt", "sweater"};
    Random random = new Random();
    int randomInteger = random.nextInt(4);
    @Before
    public void setUp() {
        // Uruchom nowy egzemplarz przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
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
        String x ="";
        driver.findElements(By.id(x));
        boolean tak = true;
        boolean nie = false;

            if (x == "mug")
        {

            Assert.assertEquals(driver.findElement(By.id("19")).equals("Wyszukiwarka dziala dobrze"));
        }
        else  if(x == "notebook") {
                Assert.assertEquals(driver.findElement(By.id("16")).equals("Wyszukiwarka dziala dobrze"));
        }
        else  if(x == "cushion") {
            Assert.assertEquals(driver.findElement(By.id("10")).equals("Wyszukiwarka dziala dobrze"));
        }
        else if(x == "t-shirt") {
                Assert.assertEquals(driver.findElement(By.id("1")).equals("Wyszukiwarka dziala dobrze"));
        }
        else {
                Assert.assertEquals(driver.findElement(By.id("2")).equals("Wyszukiwarka dziala dobrze"));
        }
        element.submit();
    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}