    package br.com.bassi.tccestruturado.exceptions;

    public class EntidadeNaoEncontradaException extends RuntimeException {
        public EntidadeNaoEncontradaException(String mensagem) {
            super(mensagem);
        }
    }
