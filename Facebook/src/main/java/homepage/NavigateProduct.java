package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavigateProduct extends CommonAPI {
    @Test
    public void productinfo(){
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']","airpods pro");
        clickOnElementByXpath("//input[@type='submit']");
        sleepFor(2);
        clickOnElementByXpath("//span[@class='a-size-medium a-color-base a-text-normal']" );
        String airpodsinfo=driver.findElement(By.xpath("//div[@id='centerCol']")).getText();
        System.out.println(airpodsinfo);
    }
}
