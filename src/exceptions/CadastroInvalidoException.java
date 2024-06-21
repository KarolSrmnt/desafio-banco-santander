package exceptions;

public class CadastroInvalidoException extends RuntimeException{

    public CadastroInvalidoException(String msg) {
        super(msg);
    }
}
