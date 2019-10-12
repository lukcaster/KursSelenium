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
        String z ="";
        driver.findElements(By.id(x));
        boolean tak = true;
        boolean nie = false;

        switch (x) {
            case "mug":
                z = "Customizable Mug";
                assert(z.equals(driver.findElement(By.id("Customizable Mug"))));
                System.out.println("Wyszukiwarka dziala dobrze");
                break;
            case "notebook":
                z = "Mountain Fox Notebook";
                assert(z.equals(driver.findElement(By.id("Mountain Fox Notebook"))));
                System.out.println("Wyszukiwarka dziala dobrze");
                break;
            case "cushion":
                z = "Mountain Fox Cushion";
                assert(z.equals(driver.findElement(By.id("Mountain Fox Cushion"))));
                System.out.println("Wyszukiwarka dziala dobrze");
                break;
            case "t-shirt":
                z = "Hummingbird Printed T-Shirt";
                assert(z.equals(driver.findElement(By.id("Hummingbird Printed T-Shirt"))));
                System.out.println("Wyszukiwarka dziala dobrze");
                break;
            case "sweater":
                z = "Hummingbird Printed Sweater";
                assert(z.equals(driver.findElement(By.id("Hummingbird Printed Sweater"))));
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