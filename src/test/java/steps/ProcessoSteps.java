package steps;

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
    private DetalheProcesso detalharProcesso = new DetalheProcesso(driver);


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
        String atual = mostrarProcesso.verifyMessage(message);

        if(atual.equals("Processo foi criado com sucesso.")){
            String codigo = driver.getText("codigo");
            novoProcesso.setCodigo(codigo);
        }
        Assert.assertEquals(atual, message);
    }

    @E("^o usuário clicar no botão editar$")
    public void oUsuarioClicarNoBotaoEditar() {
        novoProcesso.clickEditProcess(novoProcesso.getCodigo());
    }

    @Quando("^o usuário clicar em mostrar$")
    public void oUsuárioClicarEmMostrar() {
        listaProcessos.clickShowProcess(novoProcesso.getCodigo());
    }

    @Então("^o usuário deveria ver no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oUsuárioDeveriaVerNoCampoOValor(String field, String esperado) {
        String value = detalharProcesso.getValueFromField(field);
        Assert.assertEquals(esperado, value);
    }

    @E("^o usuário clicar no botão voltar$")
    public void oUsuárioClicarNoBotãoVoltar() {
        novoProcesso.clickBack();
    }
}
