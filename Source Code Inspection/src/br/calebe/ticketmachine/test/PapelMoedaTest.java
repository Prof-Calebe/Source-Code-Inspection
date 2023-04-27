import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import br.calebe.ticketmachine.core.PapelMoeda;

public class PapelMoedaTest {
  @Test
  public void instantiateClassTest() {
    PapelMoeda pm = new PapelMoeda(1, 1);
    assertEquals(PapelMoeda.class, pm.getClass());
  }
  @Test
  public void getValorSuccessTest() {
    PapelMoeda pm = new PapelMoeda(2, 2);
    assertEquals(2, pm.getValor());
  }
  
  @Test
  public void getValorErrorTest() {
    PapelMoeda pm = new PapelMoeda(2, 2);
    assertNotEquals(1, pm.getValor());
  }
  
  @Test
  public void getQuantidadeSuccessTest() {
    PapelMoeda pm = new PapelMoeda(3, 1);
    assertEquals(1, pm.getQuantidade());
  }

  @Test
  public void getQuantidadeErrorTest() {
    PapelMoeda pm = new PapelMoeda(4, 5);
    assertNotEquals(3, pm.getQuantidade());
  }
}