/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 *
 * @author pcsidsub
 */
public class Clinica {
    
    
    

    public Clinica() {
      
        
    }
    
    
    
    public void creadorPacientes(Doctor doctor, Paciente paciente){
       
       doctor.agregarPaciente(paciente);
       }
       
        
    
    
    public String consulta(Doctor doctor){
        
        String mensaje="";
        mensaje += "Doctor:";
        mensaje += doctor.getNombre()+" "+doctor.getApellido();
        mensaje += " Pacientes:";
        mensaje +=" ";
        mensaje += doctor.listaDePacintes();
        mensaje += "Cantidad de Pacientes: " + doctor.getCantPacientes();
        return mensaje;
    } 
    
    
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        
        Paciente paciente01 = new Paciente("Toto", "Dazzo", "001");
        Paciente paciente02 = new Paciente("Martin", "Balarezo", "002");
        Paciente paciente03 = new Paciente("Sandra", "Perez", "003");
        Paciente paciente04 = new Paciente("Felipe", "Toro", "003");
        Doctor doctor = new Doctor("Carlos", "Santos");                   
        clinica.creadorPacientes(doctor, paciente01);
        clinica.creadorPacientes(doctor, paciente02);
        clinica.creadorPacientes(doctor, paciente03);
        clinica.creadorPacientes(doctor, paciente04);
        System.out.println(clinica.consulta(doctor));
        
    }
}
