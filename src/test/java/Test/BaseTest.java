package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

    WebDriver driver;

    @BeforeAll

    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.beymen.com/");
        driver.manage().window().maximize();

        System.out.println("Setup method initiated!");

    }

    @AfterAll
    public void tearDown() {

        driver.quit();

        System.out.println("Test finished!");


    }
}
