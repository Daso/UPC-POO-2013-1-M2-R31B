
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
       
        Cliente cliente = new Cliente();
        
        cliente.agregarMascota(1,"Fifi");
        cliente.agregarMascota(2, "Satan");
        cliente.agregarMascota(1, "Hannibal");
        cliente.agregarMascota(3, "Piolin");
        System.out.println(cliente.queComenMisMascotas());
        
       
        
        
    }
}
