package iphone;

public class AparelhoMultiFuncional implements ReprodutorMusical, Telefone, Navegador {

    public void tocar() {
        System.out.println("Tocando música!");
    }

    public void pausar() {
        System.out.println("Pausando música!");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música!");
    }

    public void ligar() {
        System.out.println("Ligando...");

    }

    public void atender() {
        System.out.println("Chamada atendida!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Chamada encaminhada para caixa postal!");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página: ");

    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova guia: ");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

}
