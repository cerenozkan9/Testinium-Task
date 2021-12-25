package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    @Deprecated

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void homePageMethod() throws InterruptedException {

        assertCont("https://www.beymen.com/");
        logger.info("HomePage active!");

        Thread.sleep(2000);

        clickTo(By.id("onetrust-accept-btn-handler"));

        String account = "Hesabım";
        String account1 = textOne(By.cssSelector("a[title='Hesabım']"));
        assertComp(account, account1);
        logger.info("Hesabım active!");

        String favorite = "Favorilerim";
        String favorite1 = textTwo(By.cssSelector("a[title='Favorilerim']"));
        assertComp(favorite, favorite1);
        logger.info("Favorilerim active!");

        String basket = "Sepetim";
        String basket1 = textThree(By.cssSelector("a[title='Sepetim']"));
        assertComp(basket, basket1);
        logger.info("Sepetim active!");

        Thread.sleep(2000);
    }
}