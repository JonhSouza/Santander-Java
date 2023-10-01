package exerciciosFluxoRepeticao;
public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double solicitacao = 17.5;

        if (solicitacao < saldo) {
            saldo -= solicitacao;
            System.out.println("Saldo restante: " + saldo);
        }


    }

}