import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

public class TicketMachineTest {
    @Test
    public void instantiateClassTest() {
        TicketMachine ticketMachine = new TicketMachine(1);
        assertEquals(TicketMachine.class, ticketMachine.getClass());
    }
    
    @Test
    public void inserirSuccessTest() {
        TicketMachine ticketMachine = new TicketMachine(1);
        try {
            ticketMachine.inserir(2);
        } catch (PapelMoedaInvalidaException e) {
            // TODO: handle exception
        }
        assertEquals(2, ticketMachine.getSaldo());
    }
    
    @Test
    public void inserirErrorTest() {
        TicketMachine ticketMachine = new TicketMachine(1);
        try {
            ticketMachine.inserir(2);
        } catch (PapelMoedaInvalidaException e) {
            // TODO: handle exception
        }
        assertNotEquals(0, ticketMachine.getSaldo());
    }
     
    @Test
    public void imprimirSuccessTest(){
        System.out.println("imprimir");
        String classReturn = "";
        TicketMachine instance = new TicketMachine(1);
        try {
            instance.inserir(2);
        } catch (PapelMoedaInvalidaException e) {
            // TODO: handle exception
        }
        String result = "*****************\n";
        result += "*** R$ " + instance.getSaldo() + ",00 ****\n";
        result += "*****************\n";

        try {
            classReturn = instance.imprimir();
        } catch (SaldoInsuficienteException e) {
            // TODO: handle exception
        }
        assertEquals(result, classReturn);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void imprimirErrorTest(){
        System.out.println("imprimir");
        String classReturn = "";
        TicketMachine instance = new TicketMachine(20);
        try {
            instance.inserir(2);
        } catch (PapelMoedaInvalidaException e) {
            // TODO: handle exception
        }
        String result = "*****************\n";
        result += "*** R$ " + instance.getSaldo() + ",00 ****\n";
        result += "*****************\n";

        try {
            classReturn = instance.imprimir();
        } catch (SaldoInsuficienteException e) {
            // TODO: handle exception
        }
        assertNotEquals(result, classReturn);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void imprimirExceptionTest(){
        System.out.println("imprimir");
        String classReturn = "";
        TicketMachine instance = new TicketMachine(20);
        try {
            instance.inserir(2);
        } catch (PapelMoedaInvalidaException e) {
            // TODO: handle exception
        }
        try {
            classReturn = instance.imprimir();
        } catch (SaldoInsuficienteException e) {
            // TODO: handle exception
        }
    }
}