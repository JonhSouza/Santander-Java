package exset;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        palavrasUnicas = new HashSet<String>();
    }

    public void adicionarPalavra(String palavra){
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraRemovida = null;

        if (!palavrasUnicas.isEmpty()) {
            for (String s : palavrasUnicas) {
                if (s == palavra) {
                    palavraRemovida = s;
                }
                break;
            }
            palavrasUnicas.remove(palavraRemovida);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void verificarPalavra(String palavra){
        if (palavrasUnicas.contains(palavra)) {
            System.out.println("Contém!");
        } else{
            System.out.println("Palavra não encontrada!");
        }
    }

    public void exibirPalavras(){
        System.out.println(palavrasUnicas);
    }
    

}
