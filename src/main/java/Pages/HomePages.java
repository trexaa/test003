package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.PublicKey;
import java.sql.Driver;

import static ObjectsPath.HomeObjects.*;

public class HomePages {

    WebDriver driver = null;

    public HomePages (WebDriver driver){
        this.driver = driver;
    }
    public void openUrl(){
        driver.get("https://github.com/dashboard");
    }
    public void DocsButton(){
        WebElement docs = driver.findElement(DocsEl);
        docs.click();
    }
    public void NewRep() throws InterruptedException{
        WebElement newRep = driver.findElement(NewRep);
        newRep.click();
        Thread.sleep(3000);
        WebElement newRepName = driver.findElement(NewRepName);
        newRepName.click();
        Thread.sleep(3000);
        newRepName.sendKeys("test005");
        //newRepName.sendKeys(Keys.END);
        Thread.sleep(3000);
        WebElement CRB = driver.findElement(CreateRepButton);
        new Actions(driver)
                .scrollToElement(CRB)
                .click(CRB)
                .perform();




    }

}
