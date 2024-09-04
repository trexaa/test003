package ObjectsPath;

import org.openqa.selenium.By;

public class SignUpObjects {

    public static final By newEmail = By.xpath("//*[@id='email']");
    public static final By SubmitNweEmail = By.xpath("//*[@id='email-container']/div[2]/button");

    public static final By passWord = By.xpath("//*[@id='password']");
    public static final By SubmitPassWord = By.xpath("//*[@id='password-container']/div[2]/button");

    public static final By userName = By.xpath("//*[@id='login']");
    public static final By SubmitUserName = By.xpath("//*[@id='username-container']/div[2]/button");

    public static final By Submit = By.xpath("//*[@id='opt-in-container']/div[2]/button");


}
