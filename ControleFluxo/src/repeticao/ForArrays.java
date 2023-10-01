package repeticao;
public class ForArrays {
    
    public static void main(String[] args) {
        
        String alunos [] = {"FELIPE", "ÂNGELO", "DONATELO", "ROSELIE"};

        /*  Iteração com Arrays por meio do laço for simples:

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("O aluno no índice x = %d é %s.%n", i, alunos[i]);
        } */

        // Iteração de Arrays otimizada com foreach:

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

    }

}