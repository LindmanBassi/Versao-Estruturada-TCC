package br.com.bassi.tccestruturado.exceptions;

public class CredenciaisInvalidasException extends RuntimeException {
  public CredenciaisInvalidasException(String mensagem) {
    super(mensagem);
  }
}

