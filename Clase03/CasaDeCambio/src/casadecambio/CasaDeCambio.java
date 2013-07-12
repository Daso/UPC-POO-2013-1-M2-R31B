/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casadecambio;

/**
 *
 * @author pcsidsub
 */
public class CasaDeCambio {

    private double tipoDeCambio;

    public double getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(double tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }
    
    
    
    public Calculadora crearCalculadora(){
        Calculadora calculadora = new Calculadora();
        return calculadora;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
