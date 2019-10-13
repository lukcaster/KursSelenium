package przyklad1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import java.util.Random;

import static org.junit.Assert.*;

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
        String x = products[randomInteger];
        WebElement z;
        WebElement c;
        c = null;
        driver.findElements(By.id(x));
        boolean tak = true;
        boolean nie = false;

        switch (x) {
            case "mug":
                z = driver.findElement(By.className("h3 product-title"));
                driver.findElement(By.name("Hummingbird Printed Sweater")) = c;
                if (!(z != c)) {
                    System.out.println("Wyszukiwarka nie dziala dobrze");
                    break;
                } else {
                    throw new AssertionError();
                }
            case "notebook":
                z = 16;
                if (!(z == driver.findElement(By.id("16")))) {
                    throw new AssertionError();
                }
                System.out.println("Wyszukiwarka dziala dobrze");
                break;
            case "cushion":
                z = 9;
                if (!(z == driver.findElement(By.id("9")))) {
                    throw new AssertionError();
                }
                System.out.println("Wyszukiwarka dziala dobrze");
                break;
            case "t-shirt":
                z = 1;
                if (!(z == driver.findElement(By.id("1")))) {
                    throw new AssertionError();
                }
                System.out.println("Wyszukiwarka dziala dobrze");
                break;
            case "sweater":
                z = 2;
                if (!(z == driver.findElement(By.id("2")))) {
                    throw new AssertionError();
                }
                System.out.println("Wyszukiwarka dziala dobrze");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + x);
        }
        element.submit();
    }

    private void assertEquals(WebElement element) {
    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}