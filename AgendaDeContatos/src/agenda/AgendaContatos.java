package agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> agenda;

    public AgendaContatos(){
        agenda = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int numero){
        this.agenda.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(agenda);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEscolhido = new HashSet<>();

        if (!agenda.isEmpty()) {
            for (Contato c : agenda) {
                if (c.getNome().startsWith(nome)) {
                    contatosEscolhido.add(c);
                }
            }
            return contatosEscolhido;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Contato atualizarNumeroPorContato(String nome, int novoNumero) {
        Contato numeroAtualizado = null;

        for (Contato c : agenda) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                numeroAtualizado = c;
                break;
            }
        } 
        return numeroAtualizado;
    }

    



}
