package pesquisa;
public class Calc {
    public static void main(String[] args) throws Exception {
        // Criando uma instância da classe SomaNumeros
    NumerosOperacao numerosOperacao = new NumerosOperacao();

    // Adicionando números à lista
    numerosOperacao.adicionarNumero(5);
    numerosOperacao.adicionarNumero(0);
    numerosOperacao.adicionarNumero(0);
    numerosOperacao.adicionarNumero(-2);
    numerosOperacao.adicionarNumero(10);

    // Exibindo a lista de números adicionados
    System.out.println("Números adicionados:");
    numerosOperacao.exibirNumeros();

    // Calculando e exibindo a soma dos números na lista
    System.out.println("Soma dos números = " + numerosOperacao.calcularSoma());

    // Encontrando e exibindo o maior número na lista
    System.out.println("Maior número = " + numerosOperacao.encontrarNumeroMaior());

    // Encontrando e exibindo o menor número na lista
    System.out.println("Menor número = " + numerosOperacao.encontrarNumeroMenor());
    }
}
