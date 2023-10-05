package iphone;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws Exception {

        AparelhoMultiFuncional iphone = new AparelhoMultiFuncional();
        Scanner sc = new Scanner(System.in);

        System.out.println("FUNCIONALIDADES REPRODUTOR MUSICAL");

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("FUNCIONALIDADES TELEFONE");

        iphone.ligar();
        System.out.println("Deseja atender a ligação? (y/n)");
        char resp = sc.next().charAt(0);

        if (resp == 'y') {
            iphone.atender();
        } else {
            iphone.iniciarCorreioVoz();
        }

        System.out.println("FUNCIONALIDADES NAVEGADOR");

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        sc.close();

    }
}
