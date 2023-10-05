package bloco;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> notas;

    public ListaTarefas() {
        this.notas = new HashSet<>(); 
    }

    public void adicionarTarefa(String descricao) {
        this.notas.add(new Tarefa(descricao));
    }

    public Set<Tarefa> removerTarefa(String descricao) {
        Set<Tarefa> tarefaRemovida = new HashSet<>();

        if (!notas.isEmpty()) {
            for (Tarefa t : notas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemovida.add(t);
                }
                break;
            }
            return tarefaRemovida;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirTarefas() {
        System.out.println(notas);
    }

    public void contarTarefas() {
        System.out.println("Quantidade de tarefas: " + notas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : notas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : notas) {
            if (!t.isConcluida()) {
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : notas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : notas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if (tarefaParaMarcarComoPendente.isConcluida()) {
                tarefaParaMarcarComoPendente.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
        if (notas.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            notas.clear();
        }
    }
}
