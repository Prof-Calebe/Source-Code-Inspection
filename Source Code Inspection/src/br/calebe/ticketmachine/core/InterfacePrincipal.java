package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

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
        System.out.println("Saldo: R$ " + saldo + ",00");
    }

    public void solicitarBilhete() {
        try {
            String mensagem = ticketMachine.imprimir();
            System.out.println(mensagem);
            int saldo = ticketMachine.getSaldo();
            System.out.println("Saldo: R$ " + saldo + ",00");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void solicitarTroco() {
        Iterator<PapelMoeda> troco = ticketMachine.getTroco();
    }

}
