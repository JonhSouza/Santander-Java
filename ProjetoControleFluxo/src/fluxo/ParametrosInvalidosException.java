package fluxo;
public class ParametrosInvalidosException extends RuntimeException {

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }
    }

}