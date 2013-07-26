
package veterinaria;

import java.util.ArrayList;

public class Cliente {
    ArrayList<Mascota> mascotas;
    
    
    public Cliente() {
        mascotas = new ArrayList();
    }
   
    public int cantidadMascotas(){
        return mascotas.size();
    }
    
    public void agregarMascota(int tipo, String nombre){
        
        Mascota mascotaCliente = MascotaFactory.crearMascota(tipo, "Fifi");
        mascotas.add(mascotaCliente);
        
    }
    
    public String queComenMisMascotas(){
        String mensaje = "";
        for(Mascota mascota: mascotas){
            mensaje += mascota.comer();
            mensaje += " ";
            
        }
        return mensaje;
        
    }
    
    

}
