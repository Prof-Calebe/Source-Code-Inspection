package tests;

import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.core.Troco;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.Assert;
import org.junit.Test;


public class TicketMachineTest {

    @Test
    public void verifyInserirTicket2() throws PapelMoedaInvalidaException {
        int ticketPrice = 3;
        int balance = 2;

        TicketMachine ticketMachine = new TicketMachine(ticketPrice);
        ticketMachine.inserir(balance);
        Assert.assertEquals(ticketMachine.getSaldo(), balance);
    }

    @Test
    public void verifyInserirTicket5() throws PapelMoedaInvalidaException {
        int ticketPrice = 3;
        int balance = 5;

        TicketMachine ticketMachine = new TicketMachine(ticketPrice);
        ticketMachine.inserir(balance);
        Assert.assertEquals(ticketMachine.getSaldo(), balance);
    }

    @Test
    public void verifyInserirTicket10() throws PapelMoedaInvalidaException {
        int ticketPrice = 3;
        int balance = 10;

        TicketMachine ticketMachine = new TicketMachine(ticketPrice);
        ticketMachine.inserir(balance);
        Assert.assertEquals(ticketMachine.getSaldo(), balance);
    }

    @Test
    public void verifyInserirTicket20() throws PapelMoedaInvalidaException {
        int ticketPrice = 3;
        int balance = 20;

        TicketMachine ticketMachine = new TicketMachine(ticketPrice);
        ticketMachine.inserir(balance);
        Assert.assertEquals(ticketMachine.getSaldo(), balance);
    }

    @Test
    public void verifyInserirTicket50() throws PapelMoedaInvalidaException {
        int ticketPrice = 3;
        int balance = 50;

        TicketMachine ticketMachine = new TicketMachine(ticketPrice);
        ticketMachine.inserir(balance);
        Assert.assertEquals(ticketMachine.getSaldo(), balance);
    }

    @Test
    public void verifyInserirTicket100() throws PapelMoedaInvalidaException {
        int ticketPrice = 3;
        int balance = 100;

        TicketMachine ticketMachine = new TicketMachine(ticketPrice);
        ticketMachine.inserir(balance);
        Assert.assertEquals(ticketMachine.getSaldo(), balance);
    }
}