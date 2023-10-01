package repeticao;
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UseTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        boolean entradaValida = false;

        do {
            try {
                System.out.println("Digite seu nome e sobrenome: ");
                String nome = sc.nextLine();

                System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();

                System.out.println("Digite seu peso: ");
                double peso = sc.nextDouble();

                System.out.println(nome + ";");
                System.out.println(idade + ";");
                System.out.println(peso + ".");

                entradaValida = true; // Se chegou até aqui sem exceção nas variáveis numéricas, as entradas são válidas
            } catch (InputMismatchException e) {
                System.out.println("Dados inválidos. Por favor, insira a idade e o peso novamente.");
                // Limpar o buffer do scanner
                sc.nextLine();
            }
        } while (!entradaValida);

        sc.close();
    }
}