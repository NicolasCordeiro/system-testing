package pages;

import support.DriverQA;

public class ListaProcessos extends BasePage{

    public ListaProcessos(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clickNewProcess() {
        driver.click("btn-novo");
    }
}
