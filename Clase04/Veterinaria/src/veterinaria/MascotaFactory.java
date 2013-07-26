
package veterinaria;


public class MascotaFactory {
    
    public static Mascota crearMascota(int tipo, String nombre){
        Mascota mascota = null;
        
        if(tipo == 1){
            mascota = new Perro(nombre);
        }else if(tipo == 2){
            mascota = new Gato(nombre);
        }else if(tipo == 3){
            mascota = new Ave();
        }
        
        return mascota;
                            
    }
    
}
