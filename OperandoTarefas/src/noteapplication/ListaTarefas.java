package noteapplication;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {
    // criando lista
    private List<Tarefa> tarefaList;

    // construtor para criar lista vazia
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    // adicionando elementos na lista
    public void adicionarTarefas(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // método de remoção de elementos semelhantes
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        if (!tarefaList.isEmpty()) {
            for (Tarefa t : tarefaList) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }

            }
            tarefaList.removeAll(tarefasParaRemover);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println("Lista de tarefas atual: " + tarefaList);
    }

}