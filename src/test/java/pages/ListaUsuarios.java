package pages;

import support.DriverQA;

public class ListaUsuarios extends BasePage {

    public ListaUsuarios(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clickNewUsers() {
        driver.click("btn-new");
    }
}
