package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class NumerosOperacao {
    
    private List<Integer> numeros;

    public NumerosOperacao(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int calcularTotal = 0;
        if (!numeros.isEmpty()) {
            for (Integer i : numeros) {
                int valor = i;
                calcularTotal += valor;
            }
            return calcularTotal;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Integer encontrarNumeroMaior(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer i : numeros) {
                if (i >= maiorNumero) {
                    maiorNumero = i;
                }
            }
            return maiorNumero;
        } else{
             throw new RuntimeException("A lista está vazia!");
        }
    }

    public Integer encontrarNumeroMenor(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer i : numeros) {
                if (i <= menorNumero) {
                    menorNumero = i;
                }
            }
            return menorNumero;
        } else{
             throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        System.out.println(numeros);
    }

}
