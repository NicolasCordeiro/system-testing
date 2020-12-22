package pages;

import support.DriverQA;

public class DetalheUsuario extends BasePage{

    public DetalheUsuario(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String getNotice() {
        return driver.getText("notice");
    }
}
