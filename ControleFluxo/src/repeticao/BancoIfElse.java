package repeticao;
import java.util.Scanner;

public class BancoIfElse {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor > 0) {
            //Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            System.out.printf("Deposito realizado com sucesso! Saldo atual: $ %.2f%n",valor); 
        } else if (valor == 0) {
            System.out.println("Encerrando o programa..."); 
        } else {
             //Imprimir a mensagem de encerrar o programa.
             System.out.println("Valor invalido! Digite um valor maior que zero."); 
        }
        scanner.close();
    }
}

