package GitHubWeb;

import Pages.HomePages;
import Base.BaseClass;

import org.testng.annotations.Test;
import GitHubWeb.GitHubTest;

public class HomeGitHubTest extends GitHubTest {

    @Test (testName = "TS-003")
    public void HomePageFindEleMethod() throws InterruptedException{
        LoginPageMethod();
        HomePages HGHP  = new HomePages(driver);
        HGHP.openUrl();
        Thread.sleep(3000);
        HGHP.DocsButton();
        Thread.sleep(3000);
    }

    @Test (testName = "TS-004")
    public void HomePageNewRepMethod() throws InterruptedException{
        LoginPageMethod();
        HomePages newrep = new HomePages(driver);
        newrep.openUrl();
        Thread.sleep(3000);
        newrep.NewRep();
        Thread.sleep(3000);



    }

}
