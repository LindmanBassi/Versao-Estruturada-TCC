package br.com.bassi.tccestruturado.exceptions;

public class EmailJaCadastradoException extends RuntimeException {
    public EmailJaCadastradoException(String mensagem) {
        super(mensagem);
    }
}