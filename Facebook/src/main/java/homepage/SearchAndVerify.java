package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchAndVerify extends CommonAPI {
    @Test
    public void verifyproduct () {
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "i phone cases 11 pro max");

        clickOnElementByXpath("//input[@type='submit']");

        sleepFor(2);

        clickOnElementByXpath("//span[@class='a-size-base-plus a-color-base a-text-normal']");
        System.out.println(driver.findElement(By.xpath("//h1[@id='title']")).getText());
    }
}
