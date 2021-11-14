package br.com.ivanfsilva.loja.model;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String message) {
        super(message);
    }
}
