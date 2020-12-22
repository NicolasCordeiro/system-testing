package pages;

import support.DriverQA;

public class MostrarProcesso extends BasePage {

    public MostrarProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String getNotice() {
        return driver.getText("notice");
    }

    public String getNoticeAlert() {
        return driver.getText(".ls-alert-danger", "css");
    }

    public String verifyMessage(String message) {
        String messageReturn;

        switch (message){
            case "Processo foi criado com sucesso.":
                messageReturn = getNotice();
                break;
            case "Processo atualizado com sucesso.":
                messageReturn = getNotice();
                break;
            case "Vara não pode ser deixado em branco":
                messageReturn = getNoticeAlert();
                break;
            case "Data entrada não pode ser deixado em branco":
                messageReturn = getNoticeAlert();
                break;
            default:
                messageReturn = "";
                break;
        }
        return messageReturn;
    }

    public void clickSave() {
        driver.click(".ls-btn", "css");
    }

}
