
package veterinaria;


public class Veterinaria {

    public Perro crearPerro(String nombre){
        Perro perro = new Perro(nombre);
        return perro;
    }
    
    public Gato crearGato(String nombre){
        Gato gato = new Gato(nombre);
        return gato;
    }
    
    public static void main(String[] args) {
       
    }
}
