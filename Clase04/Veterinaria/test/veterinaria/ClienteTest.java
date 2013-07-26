package veterinaria;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {
    private Cliente cliente;
    
    public ClienteTest() {
        cliente = new Cliente();
    }

    @Test
    public void clienteDebeTenerMascota() {
        cliente.agregarMascota(1,"Fifi");
        
        Assert.assertEquals(1, cliente.cantidadMascotas());
        
        
    }
}
