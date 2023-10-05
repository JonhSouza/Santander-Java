package desafio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        /*
         * 1
         * ordenar lista
         * Consumer<Integer> imprimirListaOrdenada = numero -> {
         * Collections.sort(numeros);
         * System.out.println(numero);
         * };
         * 
         * numeros.stream().forEach(imprimirListaOrdenada);
         * 
         */

        /*
         * 2
         * Imprimir a soma dos números pares da lista
         * 
         * Predicate<Integer> imprimirNumeroPar = numero -> numero % 2 == 0;
         * 
         * BinaryOperator<Integer> somarPares = Integer::sum;
         * 
         * int resultado = numeros.stream()
         * 
         * .filter(imprimirNumeroPar)
         * .reduce(0, somarPares);
         * 
         * System.out.println(resultado);
         * 
         */

        /*
         * 3
         * Verifique se todos os números da lista são positivos
         * 
         * Predicate<Integer> numerosPositivos = numero -> numero > 0;
         * 
         * numeros.stream()
         * .filter(numerosPositivos)
         * .forEach(System.out::println);
         */

        

        

    }
}
