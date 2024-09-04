package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.LoginObjects.*;

public class LoginPages {

    WebDriver driver = null;

    public LoginPages(WebDriver driver){
        this.driver = driver;
    }
    public void openUrl(){
        driver.get("https://github.com/login");
    }

    public void Login(){
        WebElement login = driver.findElement(EmailLoginField);
        login.click();
        login.sendKeys("TREXtrMO007");
    }

    public void PassWord(){
        WebElement password = driver.findElement(PassWordField);
        password.click();
        password.sendKeys("Mq1q2q3qwe!@#");
    }

    public void Submit(){
        WebElement submit = driver.findElement(Submit);
        submit.click();
    }
}
