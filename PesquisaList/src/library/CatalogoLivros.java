package library;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        this.livros.add(livro);
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> autorEscolhido = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    autorEscolhido.add(l);
                }

            }
            return autorEscolhido;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> intervalo = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    intervalo.add(l);
                }
            }
            return intervalo;

        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    // busca somente o primeiro livro correspondente ao titulo selecionado, ou seja,
    // não retorna uma lista
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }

            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

}
