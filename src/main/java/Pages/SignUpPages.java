package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.SignUpObjects.*;
public class SignUpPages {

    WebDriver driver = null;

    public SignUpPages(WebDriver driver){
        this.driver = driver;
    }
    public void openUrl(){
        driver.get("https://github.com/signup");
    }
    public void SignUp() throws InterruptedException{
        WebElement NewEmail = driver.findElement(newEmail);
        NewEmail.click();
        NewEmail.sendKeys("hudsfgvfsbvlhstg@gmail.com");
        Thread.sleep((3000));
        WebElement submitnweemail = driver.findElement(SubmitNweEmail);
        submitnweemail.click();
    }
    public void passWord() throws InterruptedException{
        WebElement password = driver.findElement(passWord);
        password.click();
        password.sendKeys("Mq1q2q3qwe!@#");
        Thread.sleep((3000));
        WebElement submitpassword = driver.findElement(SubmitPassWord);
        submitpassword.click();
    }
    public void userName() throws InterruptedException{
        WebElement username = driver.findElement(userName);
        username.click();
        username.sendKeys("TREXthrtydherthetrMO007");
        Thread.sleep((3000));
        WebElement submitusername = driver.findElement(SubmitUserName);
        submitusername.click();
    }
    public void submit(){
        WebElement submit = driver.findElement(Submit);
        submit.click();
    }


}
