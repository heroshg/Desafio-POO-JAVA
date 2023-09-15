package Main.Iphone;

import Main.Iphone.Navegador.ImplementarNavegadorInternet;
import Main.Iphone.Navegador.NavegadorInternet;
import Main.Iphone.Reprodutor.ImplementarReprodutor;
import Main.Iphone.Reprodutor.ReprodutorMusical;
import Main.Iphone.Telefone.ImplementarTelefone;
import Main.Iphone.Telefone.Telefone;


public class iPhone implements ReprodutorMusical, Telefone, NavegadorInternet {
    private ReprodutorMusical reprodutor;
    private Telefone telefone;
    private NavegadorInternet navegador;

    public iPhone () {
        reprodutor = new ImplementarReprodutor();
        telefone = new ImplementarTelefone();
        navegador = new ImplementarNavegadorInternet();
    }

    @Override
    public void tocar() {
        reprodutor.tocar();
    }

    @Override
    public void pausar() {
        reprodutor.pausar();
    }

    @Override
    public void selecionarMusica() {
        reprodutor.selecionarMusica();
    }

    @Override
    public void ligar() {
        telefone.ligar();
    }

    @Override
    public void atender() {
        telefone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina() {
        navegador.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }
}
