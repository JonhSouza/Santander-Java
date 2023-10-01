package noteapplication;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) throws Exception {
        ListaTarefas listaTarefas = new ListaTarefas();
        Scanner sc = new Scanner(System.in);

        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
        System.out.println("Digite a tarefa: ");
        listaTarefas.adicionarTarefas(sc.nextLine());
        System.out.println("Digite a tarefa: ");
        listaTarefas.adicionarTarefas(sc.nextLine());
        System.out.println("Digite a tarefa: ");
        listaTarefas.adicionarTarefas(sc.nextLine());

        listaTarefas.obterDescricoesTarefas();
        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("estudar");

        listaTarefas.obterDescricoesTarefas();
        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        sc.close();
    }
}
