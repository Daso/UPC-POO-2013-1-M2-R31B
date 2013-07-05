
package coquito;


public class Coquito {

    
    public static void main(String[] args) {
               
        
        Alumno alumno = new Alumno("Pablito",8, "Pelusa");
        Alumno alumno2 = new Alumno("Carla", 4, "Bonita");
        
        
        System.out.println(alumno.tocarOreja());       
        System.out.println(alumno2.tocarOreja());
        System.out.println(alumno.mostrarZanahoria());    
        System.out.println(alumno2.mostrarZanahoria());
        
        
    }
}
