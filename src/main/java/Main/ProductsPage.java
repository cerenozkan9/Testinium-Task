package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    @Deprecated

    public ProductsPage(WebDriver driver) {

        super(driver);
    }

    public void productsPage() throws InterruptedException {

        logger.info("Product page opened!");

        Thread.sleep(2000);

        scrollDownOne();

        Thread.sleep(2000);

        randomSelect(By.xpath("//div[@class='m-productCard__photo']"));
        logger.info("Product selected!");

        Thread.sleep(2000);
    }
}