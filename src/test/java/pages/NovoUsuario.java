package pages;

import support.DriverQA;

public class NovoUsuario extends BasePage{
    public NovoUsuario(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void fillName(String name) {
        driver.sendKeys(name,"user_full_name");
    }
    public void fillAge(String age) {
        driver.sendKeys(age,"user_age");
    }

    public void fillEmail(String email) {
        driver.sendKeys(email,"user_email");
    }

    public void fillLogin(String login) {
        driver.sendKeys(login,"user_login");
    }

    public void clickSave() {
        driver.click("btn-save");
    }
}
