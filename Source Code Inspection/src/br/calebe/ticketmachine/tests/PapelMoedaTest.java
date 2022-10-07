package tests;

import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.Assert;
import org.junit.Test;


public class PapelMoedaTest {
    @Test
    public void verifyQuantity() {
        int quantity = 12;

        PapelMoeda papelMoeda = new PapelMoeda(10, quantity);
        Assert.assertEquals(papelMoeda.getQuantidade(), quantity);
    }

    @Test
    public void verifyValue() {
        int value = 12;

        PapelMoeda papelMoeda = new PapelMoeda(value, 10);
        Assert.assertEquals(papelMoeda.getValor(), value);
    }    
}