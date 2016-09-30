package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */

public class PapelMoeda {

    protected double valor;
    protected int quantidade;

    public PapelMoeda(double valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
