/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 *
 * @author pcsidsub
 */
public class Paciente {
    private String nombre;
    private String apellido;
    private String historia;

    public Paciente(String nombre, String apellido, String historia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.historia = historia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
    
    
}
