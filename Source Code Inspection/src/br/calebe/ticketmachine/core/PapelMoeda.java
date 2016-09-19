package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor;
    protected int quantidade;
    protected String tipo;

    public PapelMoeda(int valor, int quantidade, String tipo) {
        this.valor = valor;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public int getTipo() {
        return tipo;
    }
}
