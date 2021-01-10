package pages;

import support.DriverQA;

public class ListaProcessos extends BasePage{

    public ListaProcessos(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clickNewProcess() {
        driver.click("btn-novo");
    }

    public void clickShowProcess(String codigo) {
        driver.click("btn-show_"+codigo);
    }

    public void clickDelete(String codigo) {
        driver.click("btn-delete_"+codigo);
    }
}
