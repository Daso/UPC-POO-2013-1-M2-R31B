/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsidsub
 */
public class GatoTest {
    
    private Gato gato;
    
    public GatoTest() {
        gato = new Gato();
    }

    @Test
    public void gatoDebeTenerNombre() {
        Gato gato = new Gato("Satan");
        Assert.assertEquals("Satan", gato.getNombre());
    }
    
    @Test
    public void gatoDebeDecirLoQueCome(){
        Assert.assertEquals("Como pescado",gato.comer());
    }
}
