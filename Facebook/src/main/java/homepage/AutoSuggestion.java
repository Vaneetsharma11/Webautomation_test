package homepage;

import common.CommonAPI;

public class AutoSuggestion extends CommonAPI {
    public void bestgamesproduct(){
        clickOnElementByXpath("//i[@class='hm-icon nav-sprite']");
       clickOnElementByXpath("//div[contains(text(),'Echo & Alexa')]");
clickOnElementByLinkText("//ul[@class='hmenu hmenu-visible hmenu-translateX']//li[5]//a[1]");
sleepFor(2);
    }

}
