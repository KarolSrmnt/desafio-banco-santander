package exceptions;

public class ClienteNaoEncontradoException extends RuntimeException{

    public ClienteNaoEncontradoException(String msg) {
        super(msg);
    }
}
