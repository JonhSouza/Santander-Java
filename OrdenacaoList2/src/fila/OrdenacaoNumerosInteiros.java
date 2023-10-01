package fila;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumerosInteiros {

    private List<Integer> listaNumeros;

    public OrdenacaoNumerosInteiros() {
        this.listaNumeros =  new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()) {
            System.out.println(this.listaNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

}
