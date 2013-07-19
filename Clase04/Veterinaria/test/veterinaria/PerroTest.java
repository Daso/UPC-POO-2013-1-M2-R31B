
package veterinaria;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class PerroTest {
    private Perro perro;
    public PerroTest() {
        perro = new Perro();
    }

    @Test
    public void unPerroTieneQueTenerNombre() {
        Perro perro = new Perro("Fifi");
        Assert.assertEquals("Fifi", perro.getNombre());
    }
    
    @Test
    public void unPerroPuedeTenerRaza(){
        perro.setRaza("Boxer");
        Assert.assertEquals("Boxer",perro.getRaza());
    }
    
    @Test
    public void unPerroPuedeTenerTamanho(){
        perro.setTamanho("Grande");
        Assert.assertEquals("Grande",perro.getTamanho());
    }
    
    @Test
    public void perroDebeDecirLoQueCome(){
        Assert.assertEquals("Como carne",perro.comer());
    }
    
}
