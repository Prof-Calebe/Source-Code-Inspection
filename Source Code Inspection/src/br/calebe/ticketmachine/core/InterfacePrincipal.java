package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

public class InterfacePrincipal {

    public TicketMachine ticketMachine;

    public InterfacePrincipal() {
        int valorBilhete = 130;
        ticketMachine = new TicketMachine(valorBilhete);
    }

    public void inserirDinheiro(int valor) {
        try {
            ticketMachine.inserir(valor);
        } catch (PapelMoedaInvalidaException e) {
            System.out.println(e.getMessage());
        }

        int saldo = ticketMachine.getSaldo();
        System.out.println("Saldo: " + saldo);
    }

    public void solicitarBilhete() {
        try {
            ticketMachine.imprimir();
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

}
