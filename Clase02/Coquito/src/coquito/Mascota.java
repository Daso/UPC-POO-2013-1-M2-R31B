
package coquito;


public class Mascota {
    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }
    
    public String moverColita(){
        return "Soy " + nombre + " y estoy moviendo la colita";
    }
    
    public String acercarse(){
        return "Soy " + nombre + " y me estoy acercando";
    }
    
}
