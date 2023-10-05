package convite;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String Convidado, int codigoConvite) {
        this.convidados.add(new Convidado(Convidado, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        if (!convidados.isEmpty()) {
            for (Convidado c : convidados) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    
                }
               break;
            }
             convidados.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

    }

    public int contarConvidados(){
       return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);

    }
}
