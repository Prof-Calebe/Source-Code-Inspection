/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import br.calebe.ticketmachine.core.Troco;
import br.calebe.ticketmachine.core.Troco.TrocoIterator;

/**
 *
 * @author 31517072
 */
public class TrocoTeste {
    
    @Test
    public void testarInstanciação(){
        Troco troco = new Troco(50);
    }
    public TrocoTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
