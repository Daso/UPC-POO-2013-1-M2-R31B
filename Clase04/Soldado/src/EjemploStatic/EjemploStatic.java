package EjemploStatic;

public class EjemploStatic {

    
    public static void main(String[] args) {
        Soldado soldado = new Soldado("Carlos");
        
         Soldado soldado1 = new Soldado("Pedro");
        
        
        Impresora.imprimir(soldado);
        
        Impresora impresora = new Impresora();
        System.out.println(impresora.status());
        
    }
}
