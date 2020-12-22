package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class UserSteps extends BaseSteps {
    private HomePage homePage = new HomePage(driver);
    private MenuImpacta menuImpacta = new MenuImpacta(driver);
    private ListaUsuarios listaUsuarios = new ListaUsuarios(driver);
    private NovoUsuario novoUsuario = new NovoUsuario(driver);
    private DetalheUsuario detalheUsuario = new DetalheUsuario(driver);

    @Dado("^que o usuário está na página inicial$")
    public void
    queOUsuarioEstaNaPaginaInicial() {
        homePage.Open();
    }

    @E("^o usuário clica no menu usuários$")
    public void oUsuarioClicaNoMenuUsuarios() {
        menuImpacta.clickUsers();
    }

    @E("^o usuário clica no botão novo usuário$")
    public void oUsuarioClicaNoBotaoNovoUsuario() throws InterruptedException {
        Thread.sleep(2000);
        listaUsuarios.clickNewUsers();
    }

    @E("^o usuário preencha os campos obrigatórios$")
    public void oUsuarioPreenchaOsCamposObrigatorios() {
        novoUsuario.fillLogin("superman");
        novoUsuario.fillName("Agapito Kent");
        novoUsuario.fillEmail("agapitokent@gmail.com");
        novoUsuario.fillAge("28");
    }

    @Quando("^o usuário clicar no botão salvar$")
    public void oUsuarioClicarNoBotaoSalvar() {
        novoUsuario.clickSave();
    }

    @Então("^o usuario deveria ver a mensagem \"([^\"]*)\"$")
    public void oUsuarioDeveriaVerAMensagem(String message){
        Assert.assertEquals(message,detalheUsuario.getNotice());
    }
}
