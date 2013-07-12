package casadecambio;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void debePoderConvertirSolesADolares() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(100.0, calculadora.convertirADolares(277.0, 2.77));
    }
}
