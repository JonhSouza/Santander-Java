import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcesSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        imprimirSelecionados();
        String[] candidatos = { "Jônathas", "Matheus", "Geraldo", "Rafael", "Gabriel" };

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar e apresentar contraproposta");
        } else {
            System.out.println("Esperando a resposta dos demais candidatos");
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Jonathas", "Matheus", "Geraldo", "Rafael", "Danielly", "Adriel", "Gabriel", "Daniel",
                "Kaylane", "Lucia" };
        int selecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (selecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicita " + salarioPretendido + " de salário.");
            if (salarioBase >= salarioPretendido) {
                selecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado.");

            }
            candidatoAtual++;
        }

    }

    static void imprimirSelecionados() {

        String[] candidatos = { "Jônathas", "Matheus", "Geraldo", "Rafael", "Gabriel" };

        System.out.println("Imprimindo selecionados...");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {

            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " LIGAÇÃO");

        } else {

            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + "." + " NÚMERO DE TENTATIVAS: " + tentativasRealizadas);

        }
    }
}
