package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDeletion extends BasePage {

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    @Deprecated

    public ProductDeletion(WebDriver driver) {

        super(driver);
    }

    public void deletionPage() throws InterruptedException {

        clickTo(By.id("removeCartItemBtn0"));
        logger.info("The product deleted from the cart.");
        Thread.sleep(2000);

        String emptyMyBasket = textFour(By.cssSelector("strong[class='m-empty__messageTitle']"));
        String emptyBasket = "Sepetinizde Ürün Bulunmamaktadır";
        assertComp(emptyMyBasket, emptyMyBasket);

        logger.info("No product found in the cart!");
        Thread.sleep(2000);

    }
}