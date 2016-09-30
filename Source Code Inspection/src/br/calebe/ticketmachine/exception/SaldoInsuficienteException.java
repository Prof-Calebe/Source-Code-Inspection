package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
  public SaldoInsuficienteException ()
    {
        super ("Saldo insuficiente!");
    }

    public SaldoInsuficienteException ( String message )
    {
        super ( message );
    }

    public SaldoInsuficienteException ( String message , Throwable cause )
    {
        super ( message , cause );
    }

    public SaldoInsuficienteException ( Throwable cause )
    {
        super ( cause );
    }

    public SaldoInsuficienteException ( String message , Throwable cause , boolean enableSuppression , boolean writableStackTrace )
    {
        super ( message , cause , enableSuppression , writableStackTrace );
    }
}
