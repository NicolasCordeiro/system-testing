package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class ProcessoSteps extends BaseSteps {
    private HomePage homePage = new HomePage(driver);
    private MenuImpacta menuImpacta = new MenuImpacta(driver);
    private ListaProcessos listaProcessos = new ListaProcessos(driver);
    private NovoProcesso novoProcesso = new NovoProcesso(driver);
    private MostrarProcesso mostrarProcesso = new MostrarProcesso(driver);


    @E("^o usuário clica no menu processos$")
    public void oUsuarioClicaNoMenuProcessos() {
        menuImpacta.clickProcess();
    }

    @E("^o usuário clica no botão novo processo$")
    public void oUsuarioClicaNoBotaoNovoProcesso() throws InterruptedException {
        Thread.sleep(4000);
        listaProcessos.clickNewProcess();
    }

    @E("^o usuário informar no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oUsuarioInformarNoCampoOValor(String field, String value) {
        novoProcesso.preencherCampo(field, value);
    }

    @Quando("^o usuário clicar em salvar$")
    public void oUsuarioClicarEmSalvar() {
        novoProcesso.clickSave();
    }

    @Então("^o usuário deveria ver a mensagem \"([^\"]*)\"$")
    public void oUsuarioDeveriaVerAMensagem(String message) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(mostrarProcesso.verifyMessage(message), message);
    }

    @E("^o usuário clicar no botão editar$")
    public void oUsuarioClicarNoBotaoEditar() {
        mostrarProcesso.clickSave();
    }
}
