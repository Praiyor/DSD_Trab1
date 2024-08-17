package Exceptions;

public class PessoaNEncontradaException extends RuntimeException{
    public PessoaNEncontradaException(String mensagem){
        super(mensagem);
    }
}
