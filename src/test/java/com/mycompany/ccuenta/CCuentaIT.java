/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ccuenta;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author María Navarro Elbal
 */
public class CCuentaIT {

    public CCuentaIT() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double cantidad = 3000;
        //CCuenta instance = new CCuenta();
        CCuenta instance = new CCuenta("Manuel Mantecas", "0000-1234-55-123456789", 3000, 0);
        instance.ingresar(cantidad);
        double resultadoEsperado = 6000;
        double resultado = instance.getEstado();
        assertEquals(resultadoEsperado,resultado);
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIngresarRetirar() throws Exception {
        System.out.println("ingresar y retirar");
        double cantidad = 3000;
        double cantidadRetirar = 2000;
        //CCuenta instance = new CCuenta();
        CCuenta instance = new CCuenta("Manuel Mantecas", "0000-1234-55-123456789", 3000, 0);
        instance.ingresar(cantidad);
        instance.retirar(cantidadRetirar);
        double resultadoEsperado = 4000;
        double resultado = instance.getEstado();
        assertEquals(resultadoEsperado,resultado);
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
    
//    @Test
//    public void testIngresarRetirar() throws Exception {
//        System.out.println("ingresar y retirar");
//        double cantidad = 2000;
//        double cantidadRetirar = 1000;
//        //CCuenta instance = new CCuenta();
//        CCuenta instance = new CCuenta("Manuel Mantecas", "0000-1234-55-123456789", 3000, 0);
//        instance.ingresar(cantidad);
//        instance.retirar(cantidadRetirar);
//        double resultado = instance.getEstado();
//        double resultadoEsperado = 4000;
//
//        assertEquals(resultadoEsperado, resultado);
//
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

//    @Test
//    public void testIngresarRetirar() throws Exception {
//        System.out.println("ingresar y retirar");
//        double cantidad = 3000;
//        double cantidadRetirar = 200;
//        CCuenta instance = new CCuenta();
//        instance.ingresar(cantidad);
//        instance.retirar(cantidadRetirar);
//        double valor = instance.getEstado();
//        double valorEsperado = 2800;
//        assertEquals(valorEsperado, valor);
//
//        // TODO review the generated test code and remove the default call to fail.
//        // fail("The test case is a prototype.");
//    }
    @Test
    public void testRetirarValido() throws Exception {
        System.out.println("retirar");
        double cantidad = 200.0;
        double resultadoEsperado = 2800;
        CCuenta instance = new CCuenta("Manuel Mantecas", "0000-1234-55-123456789", 3000, 0);
        instance.retirar(cantidad);
        double resultado = instance.getEstado();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(resultadoEsperado, resultado, "No son iguales");

    }

    @Test 
    public void testRetirarNoValidoMayorSaldo() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            System.out.println("retirar mas del saldo disponible");
            double cantidad =4000 ;

            CCuenta instance = new CCuenta("Manuel Mantecas", "0000-1234-55-123456789", 3000, 0);
            instance.retirar(cantidad);

        });

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals("No se hay suficiente saldo", exception.getMessage());

        /*public void whenExceptionThrown_thenAssertionSucceeds() {
    Exception exception = assertThrows(NumberFormatException.class, () -> {
        Integer.parseInt("1a");
    });

    String expectedMessage = "For input string";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
}*/
    }

    /**
     * Test of setNombre method, of class CCuenta.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nom = "";
        CCuenta instance = new CCuenta();
        instance.setNombre(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class CCuenta.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class CCuenta.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        CCuenta instance = new CCuenta();
        double expResult = 0.0;
        double result = instance.getEstado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class CCuenta.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.retirar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class CCuenta.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cobroFactura method, of class CCuenta.
     */
    @Test
    public void testCobroFactura() {
        System.out.println("cobroFactura");
        String tipo = "";
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.cobroFactura(tipo, cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class CCuenta.
     */
//    @Disabled
//    public void testSetNombre() {
//        System.out.println("setNombre");
//        String nom = "";
//        CCuenta instance = new CCuenta();
//        instance.setNombre(nom);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNombre method, of class CCuenta.
//     */
//    @Disabled
//    public void testGetNombre() {
//        System.out.println("getNombre");
//        CCuenta instance = new CCuenta();
//        String expResult = null;
//        String result = instance.getNombre();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //  fail("The test case is a prototype.");
//    }
    /**
     * Test of getEstado method, of class CCuenta.
     */
//    @Test
//    public void testGetEstado() {
//        System.out.println("getEstado");
//        CCuenta instance = new CCuenta();
//        double expResult = 0.0;
//        double result = instance.getEstado();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    /**
     * Test of ingresar method, of class CCuenta.
     */
    /**
     * Test of getCuenta method, of class CCuenta.
     */
//    @Test
//    public void testGetCuenta() {
//        System.out.println("getCuenta");
//        CCuenta instance = new CCuenta();
//        String expResult = null;
//        String result = instance.getCuenta();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cobroFactura method, of class CCuenta.
//     */
//    @Test
//    public void testCobroFactura() {
//        System.out.println("cobroFactura");
//        String tipo = "Luz";
//        double cantidad = 0.0;
//        CCuenta instance = new CCuenta();
//        instance.cobroFactura(tipo, cantidad);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    /**
     * Test of retirar method, of class CCuenta.
     */
    /**
     * Test of retirar method, of class CCuenta.
     */
//    @Test
//    public void testRetirar() throws Exception {
//        System.out.println("retirar");
//        double cantidad = 0.0;
//        CCuenta instance = new CCuenta();
//        instance.retirar(cantidad);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
