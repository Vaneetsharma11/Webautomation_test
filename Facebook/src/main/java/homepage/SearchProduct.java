package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchProduct extends CommonAPI {
    @Test
    public void searchvalue() {

        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "bamboo stickes");
        driver.findElement(By.className("nav-input")).click();
        sleepFor(3);
       clickOnElementByXpath("//span[contains(text(),'ufengke Chinese Stytle Green Bamboo and Bird Wall')]");
       clickOnElementByXpath("//input[@id='add-to-cart-button']");
       sleepFor(3);
    }
}