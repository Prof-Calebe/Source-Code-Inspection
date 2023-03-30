/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author eijik
 */


public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TicketMachine ticketMachine = new TicketMachine(5);
        
        // Inserindo nota de 5
        try {
            ticketMachine.inserir(5);
        } catch (PapelMoedaInvalidaException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Imprimindo saldo
        System.out.println(ticketMachine.getSaldo());
        
        // Comprando um ticket
        try {
            System.out.println(ticketMachine.imprimir());
        } catch (SaldoInsuficienteException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Imprimindo saldo
        System.out.println(ticketMachine.getSaldo());
        
        Iterator<PapelMoeda> trocoIterator = ticketMachine.getTroco();
        
        while(trocoIterator.hasNext()){
            PapelMoeda papelMoeda = trocoIterator.next();
            System.out.println(papelMoeda.getQuantidade() + " x R$" + papelMoeda.getValor());
        }
    }
    
}
