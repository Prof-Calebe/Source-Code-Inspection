package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
    public PapelMoedaInvalidaException ()
    {
        super ("Papel-Moeda invalido!");
    }

    public PapelMoedaInvalidaException ( String message )
    {
        super ( message );
    }

    public PapelMoedaInvalidaException ( String message , Throwable cause )
    {
        super ( message , cause );
    }

    public PapelMoedaInvalidaException ( Throwable cause )
    {
        super ( cause );
    }

    public PapelMoedaInvalidaException ( String message , Throwable cause , boolean enableSuppression , boolean writableStackTrace )
    {
        super ( message , cause , enableSuppression , writableStackTrace );
    }
}
