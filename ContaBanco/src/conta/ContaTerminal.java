package conta;
import java.util.Locale;
import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Por favor, digite o número de sua agência: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o nome de sua agência: ");
        String agencia = sc.next();

        System.out.println("Por favor, digite o seu nome e sobrenome:");
        String nome = sc.nextLine();

          sc.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

         System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);

        sc.close();
    }
}
