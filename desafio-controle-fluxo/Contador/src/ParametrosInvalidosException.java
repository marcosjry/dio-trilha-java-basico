

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
    public ParametrosInvalidosException(Throwable causa) {
        super(causa);
    }
}
