package br.com.bassi.tccestruturado.exceptions;

public class CpfJaCadastradoException extends RuntimeException {
    public CpfJaCadastradoException(String mensagem) {
        super(mensagem);
    }
}