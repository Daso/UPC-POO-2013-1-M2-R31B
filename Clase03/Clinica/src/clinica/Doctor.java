/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 *
 * @author pcsidsub
 */
public class Doctor {
    private String nombre;
    private String apellido;
    private int cantPacientes;
    private Paciente[] pacientes;

    public Doctor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantPacientes = 0;
        this.pacientes = new Paciente[10];
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

    public int getCantPacientes() {
        return cantPacientes;
    }

    public void setCantPacientes(int cantPacientes) {
        this.cantPacientes = cantPacientes;
    }
    
    public void agregarPaciente(Paciente paciente){
        this.pacientes[cantPacientes] = paciente;
        cantPacientes++;
    }
    
    public String listaDePacintes(){
        String mensaje = "";
        for(int aux = 0; aux < cantPacientes; aux++){
            mensaje += " " + pacientes[aux].getNombre() + " " + pacientes[aux].getApellido()+" | ";
        }
        return mensaje;
    }
}
