package pages;

import support.DriverQA;

public class DetalheProcesso extends BasePage{

    public DetalheProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String getValueFromField(String field) {

        switch (field)
        {
            case "codigo":
                return driver.getText("codigo");
            case "vara":
                return driver.getText("vara");
            case "numero processo":
                return driver.getText("numero");
            case "natureza":
                return driver.getText("natureza");
            case "partes":
                return driver.getText("partes");
            case "urgente":
                return driver.getText("urgente");
            case "arbitramento":
                return driver.getText("arbitramento");
            case "assistente social":
                return driver.getText("as_social");
            case "data entrada":
                return driver.getText("dt_entrada");
            case "status":
                return driver.getText("status");
            default:
                return "";
        }
    }

}
