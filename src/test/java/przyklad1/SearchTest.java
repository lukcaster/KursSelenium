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
    String x = products[randomInteger];
    
    
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
       
        
       
      
        


        switch (x) {
            case "mug":

                System.out.println("before assert");
                Assert.assertEquals("mug",products[0]);
                System.out.println("aftrer assert");

                break;
          case "notebook":
              System.out.println("before assert");
              Assert.assertEquals("notebook",products[1]);
              System.out.println("aftrer assert");

               break;
           case "cushion":
               System.out.println("before assert");
               Assert.assertEquals("cushion",products[2]);
               System.out.println("aftrer assert");


                break;
            case "t-shirt":
                System.out.println("before assert");
        Assert.assertEquals("t-shirt",products[3]);
                System.out.println("aftrer assert");


                break;
            case "sweater":
                System.out.println("before assert");
        Assert.assertEquals("sweater",products[4]);
                System.out.println("aftrer assert");


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