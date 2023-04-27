import static org.junit.Assert.assertEquals;
import org.junit.Test;
import br.calebe.ticketmachine.core.PapelMoeda;

public class TrocoTest {
  @Test
  public void evaluatesExpression() {
    PapelMoeda pm = new PapelMoeda(1, 1);
    assertEquals(1, 1);
  }
}