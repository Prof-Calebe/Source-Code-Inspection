package br.calebe.ticketmachine.core;



/**
 *
 * @author Gustavo Dechechi
 */


public class PapelMoeda {
    //Computação - Não faz acesso as variaveis valor e quantidade que estão na classe TicketMachine e vice-versa (deveriam
//     estar entrelaçadas).
    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }  

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
