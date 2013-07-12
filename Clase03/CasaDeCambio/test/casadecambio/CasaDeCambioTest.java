package casadecambio;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasaDeCambioTest {
    
    public CasaDeCambioTest() {
    }

    @Test
    public void deboPoderCrearUnaCalculadora() {
        CasaDeCambio casaDeCambio = new CasaDeCambio();
        Assert.assertNotNull(casaDeCambio.crearCalculadora());
    }
    
    @Test
    public void deboPoderAsignarElTipoDeCambioALaCalculadora(){
        CasaDeCambio casaDeCambio = new CasaDeCambio();
        casaDeCambio.setTipoDeCambio(2.77);
        Assert.assertEquals(2.77, casaDeCambio.getTipoDeCambio(),0);
    }
}
