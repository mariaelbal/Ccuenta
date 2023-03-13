/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ccuenta;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author María Navarro Elbal
 * @version 1.0
 */

/**
     * Clase CCuenta contiene los atributos y métodos de una cuenta corriente
     * nombre es atributo de la clase cuenta
     * cuenta es atributo String que contiene los veinte digitos de cuenta
     * saldo es atributo double que contiene el saldo de mi cuenta
     * tipoInteres es atributo double que contiene el tipo de interes de mi cuenta
     * factura es un array de String que contiene los tipos de factura de los que se hará un cargo
     */
public class CCuenta {
    
    

    // Propiedades de la Clase Cuenta
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private String[] factura = {"seguro", "luz", "agua", "alquiler"};

    /**
     * Constructor sin argumentos
     */
    /* Constructor sin argumentos */
    public CCuenta() {
    }
   
    /**
     * Constructor con parametros para construir objeto CCuenta
     * @param nom de tipo String, para asignar su valor al atributo nombre
     * @param cue de tipo String, para asi
     * @param sal 
     * @param tipo 
     */
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    // Método para asignar el nombre del titular de la cuenta
    
    /**
     * Método para asignar nombre al atributo nombre
     * @param nom de tipo String, asginar...
     */
    public void setNombre(String nom) {
        nombre = nom;
    }

    // Método que me devuelve el nombre del titular
    /**
     * Método que devuelve el atributo nombre de la clase Ccuenta
     * @return devuelve String, devuelve el atributo nombre 
     */
    public String getNombre() {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
    public double getEstado() {
        return saldo;
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
   
  /**
   * Metodo que incrementa el atributo saldo de Ccuenta a partir del double recibido como parametro
   * @param cantidad tipo double....
   * @throws Exception Lanzará excepción si la cantidad es inferior a 0
   */
    public void ingresar(double cantidad) throws Exception  {
        if (cantidad < 0) {
           
                throw new Exception("No se puede ingresar una cantidad negativa");
          
        }
        saldo = saldo + cantidad;
    }

/**
 * 
 * @param cantidad dfsd
 * @throws Exception 
 */
    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad-1;
    }

    // Método que me devuelve el número de cuenta
    public String getCuenta() {
        return cuenta;
    }

    public void cobroFactura(String tipo,double cantidad){
        switch(tipo){
        
            case "alquiler":
                if (cantidad >0 && cantidad<=400)
                    this.saldo -=cantidad; //this.saldo = this.saldo-cantidad;
                break;
            case "luz":
                if (cantidad<=200)
                    this.saldo -=cantidad;
            case "agua":
                
                if (cantidad >0 && cantidad<=200)
                    this.saldo -=cantidad;
                break;
            case "seguro":
                if (cantidad >0 && cantidad<=125)
                    this.saldo -=cantidad;
                    
                
        }
    
    }
    
}
    
 