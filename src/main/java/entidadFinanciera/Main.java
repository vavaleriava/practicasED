/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

import entidadFinanciera.CCuenta;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        
        //el parametro cantidadEsperada debe ser saldoActual+5/-5 ya que es el valor que ingreso/retiro
        probarIngresar(objetoCuenta, saldoActual+5);
        probarRetirar(objetoCuenta, saldoActual-5);
    }

    public static void probarRetirar(CCuenta objetoCuenta, double cantidadEsperada) {
        try {
            objetoCuenta.retirar(5);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public static void probarIngresar(CCuenta objetoCuenta, double cantidadEsperada) {
        try {
            objetoCuenta.ingresar(5);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
