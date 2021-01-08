package pages;

import support.DriverQA;

public class NovoProcesso extends BasePage{

    public NovoProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    private String codigo;

    public String getCodigo(){ return codigo; }

    public void setCodigo(String codigo){ this.codigo = codigo; }

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
            case "assistente social":
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
        driver.selectByText(valor,"processo_urgente");
    }

    private void preencherArbitramento(String valor) {
        if(valor.toLowerCase().equals("sim"))
            driver.click("processo_arbitramento_s");
        else
            driver.click("processo_arbitramento_n");
    }

    private void preencherInput(String elemento, String valor) {
        driver.sendKeys(valor,elemento);
    }
    public void clickSave() {
        driver.click("btn-save");
    }

    public void clickEditProcess(String codigo) {
        driver.click(".ls-btn","css");
    }

    public void clickBack() {
        driver.click("Voltar","link");
    }
}
