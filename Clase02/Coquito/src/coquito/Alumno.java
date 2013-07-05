
package coquito;


public class Alumno {
    private String nombre;
    private int edad;
    private Mascota mascota;

    public Alumno(String nombre, int edad, String nombreMascota) {
        this.nombre = nombre;
        this.edad = edad;
        this.mascota = new Mascota(nombreMascota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String tocarOreja(){
        return "Soy " + nombre + " y le estoy tocando la oreja " + mascota.moverColita();
    }
    
    public String mostrarZanahoria(){
        return "Soy " + nombre + " y le estoy mostrando una zanahoria " + mascota.acercarse();
    }
    
}
