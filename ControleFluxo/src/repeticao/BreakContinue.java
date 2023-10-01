package repeticao;
public class BreakContinue {
    public static void main(String[] args) {

        // Iteração com break
        for (int i = 0; i <= 5; i++) {

            if (i == 3) {
                break;

            }
            System.out.println(i);
        }
        // Iteração com continue
        for (int i = 0; i <= 5; i++) {

            if (i == 3) {
                continue;
            }
            System.out.println(i);

        }
    }
}