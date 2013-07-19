package EjemploStatic;

public class Soldado {

    private String nombre;
    private static int numero;

    public Soldado(String nombre) {
        this.nombre = nombre;
        this.numero++;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
}
