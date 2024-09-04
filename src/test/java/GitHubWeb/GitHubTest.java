package GitHubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import Pages.SignUpPages;
import org.testng.annotations.Test;

public class GitHubTest extends BaseClass {
    @Test (testName = "TS-001")
    public void LoginPageMethod() throws InterruptedException{
        LoginPages loginpages = new LoginPages(driver);
        loginpages.openUrl();
        loginpages.Login();
        Thread.sleep(3000);
        loginpages.PassWord();
        Thread.sleep(3000);
        loginpages.Submit();
    }

//    @Test (testName = "TS-002")
//    public void SignUpMethod() throws InterruptedException {
//        SignUpPages signuppages = new SignUpPages(driver);
//        signuppages.openUrl();
//        signuppages.SignUp();
//        Thread.sleep((3000));
//        signuppages.passWord();
//        Thread.sleep((3000));
//        signuppages.userName();
//        Thread.sleep((3000));
//        signuppages.submit();
//        Thread.sleep((60000));
//    }

}
