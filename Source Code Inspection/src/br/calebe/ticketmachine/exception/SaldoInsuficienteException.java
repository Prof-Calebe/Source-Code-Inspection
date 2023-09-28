package br.calebe.ticketmachine.exception;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        super("Saldo insuficiente.");
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
