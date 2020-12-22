package pages;

import support.DriverQA;

public class HomePage extends BasePage{
    private String URL = "http://agapito-server.herokuapp.com/";

    public HomePage(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void Open() {
        driver.openURL(URL);
    }
}
