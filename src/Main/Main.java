package Main;

import Main.Iphone.iPhone;

public class Main {
    public static void  main (String[] args) {
        iPhone iphone = new iPhone();

        iphone.tocar();
        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar();
        iphone.exibirPagina();
    }
}
