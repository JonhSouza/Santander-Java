package fila;
public class SistemaNumeros {
    public static void main(String[] args) throws Exception {
         // Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoNumerosInteiros numeros = new OrdenacaoNumerosInteiros();

    // Adicionando números à lista
    numeros.adicionarNumero(2);
    numeros.adicionarNumero(5);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(99);

    // Exibindo a lista de números adicionados
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem ascendente
    System.out.println(numeros.ordenarAscendente());

    // Exibindo a lista
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem descendente
    System.out.println(numeros.ordenarDescendente());

    // Exibindo a lista
    numeros.exibirNumeros();
    }
}
