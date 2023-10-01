package fluxo;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean validacao = false;

        do {

            System.out.println("Entre com o primeiro parâmetro: ");
            int parametro1 = sc.nextInt();

            System.out.println("Entre com o segundo parâmetro: ");
            int parametro2 = sc.nextInt();

            try {
                ParametrosInvalidosException.contar(parametro1, parametro2);
                validacao = true;

                for (int contagem = 1; parametro1 < parametro2; contagem++) {
                    parametro1++;
                    System.out.println("imprimindo número: " + contagem);
                }

            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
            }

            sc.nextLine();

        } while (validacao == false);

        sc.close();

    }

}
