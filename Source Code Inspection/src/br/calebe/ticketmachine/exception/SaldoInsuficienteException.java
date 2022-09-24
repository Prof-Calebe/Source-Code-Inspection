package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
    public int statusCode;
    public String message;
    
    public SaldoInsuficienteException(int _statusCode, String _message){
        statusCode = _statusCode;
        message = _message;
    }
}
