
package EjemploStatic;


public class Impresora {
    
    public String status(){
        return "Disponible";
    }
    
    public static void imprimir(Soldado soldado){
        System.out.println("Soldado: " + soldado.getNombre());
    }
    
    
}
