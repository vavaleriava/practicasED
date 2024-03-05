/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public static String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
    
    public double estado(){
        return this.saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception (ERRORCANTIDADNEGATIVA);
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    private static final String ERRORCANTIDADNEGATIVA = "No se puede retirar una cantidad negativa";
}


    
   