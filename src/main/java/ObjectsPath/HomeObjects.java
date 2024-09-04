package ObjectsPath;

import org.openqa.selenium.By;

public class HomeObjects {
    public static final By DocsEl = By.xpath("//*[contains(text(),'Docs')]");
    public static final By NewRep = By.xpath("//*[contains(text(),'New')]");
    public static final By NewRepName = By.xpath("//input[contains(@id,':r5:')]");
    public static final By CreateRepButton = By.xpath("//span[text()='Create repository']");
}
