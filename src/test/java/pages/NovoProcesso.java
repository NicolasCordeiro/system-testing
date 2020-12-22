package pages;

import support.DriverQA;

public class NovoProcesso extends BasePage{

    public NovoProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void preencherCampo(String field, String value) {

        switch (field)
        {
            case "vara":
                preencherInput("processo_vara", value);
                break;
            case "numero processo":
                preencherInput("processo_numero_processo", value);
                break;
            case "natureza":
                preencherInput("processo_natureza", value);
                break;
            case "partes":
                preencherInput("processo_partes", value);
                break;
            case "urgente":
                preencherUrgente(value);
                break;
            case "arbitramento":
                preencherArbitramento(value);
                break;
            case "assistencia social":
                preencherInput("processo_assistente_social", value);
                break;
            case "data entrada":
                preencherInput("processo_data_entrada", value);
                break;
            case "status":
                preencherInput("processo_status", value);
                break;
        }
    }

    private void preencherUrgente(String valor) {
        if(valor.toLowerCase().equals("sim"))
            driver.click("processo_arbitramento_s");
        else
            driver.click("#processo_arbitramento_n","css");
    }

    private void preencherArbitramento(String valor) {
        driver.selectByText(valor,"processo_urgente");
    }

    private void preencherInput(String elemento, String valor) {
        driver.sendKeys(valor,elemento);
    }
    public void clickSave() {
        driver.click("btn-save");
    }
}
