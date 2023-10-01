import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InvestimentoArrayList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos

    System.out.println("Digite a sua quantidade de ativos em números: ");
    int quantidadeAtivos = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite o nome completo de seus ativos: "); 

    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
       
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
      
    }

    //Ordenar os ativos em ordem alfabética.

    Collections.sort(ativos);
    
    //Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.

    for (String ativo : ativos) {
        System.out.println(ativo);
    }
    scanner.close();
  }
}

