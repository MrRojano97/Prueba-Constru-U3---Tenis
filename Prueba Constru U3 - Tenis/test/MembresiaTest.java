/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elias
 */
public class MembresiaTest {
    
    public MembresiaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of esPagada method, of class Membresia.
     */
    @Test
    public void testEsPagada() {
        System.out.println("esPagada");
        Membresia instance = new Membresia();
        boolean expResult = false;
        instance.setPagada(expResult);
        boolean result = instance.esPagada();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFechaInicio method, of class Membresia.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Membresia instance = new Membresia();
        Fecha expResult = null;
        instance.setFechaInicio(expResult);
        Fecha result = instance.getFechaInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of esActiva method, of class Membresia.
     */
    @Test
    public void testEsActiva() {
        System.out.println("esActiva");
        Membresia instance = new Membresia();
        boolean expResult = false;
        instance.setActiva(expResult);
        boolean result = instance.esActiva();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPagada method, of class Membresia.
     */
    @Test
    public void testSetPagada() {
        System.out.println("setPagada");
        boolean pagada = false;
        Membresia instance = new Membresia();
        instance.setPagada(pagada);
        assertEquals(pagada, instance.esPagada());
    }

    /**
     * Test of setFechaInicio method, of class Membresia.
     */
    @Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Fecha fechaInicio = new Fecha();
        fechaInicio.setFecha(12, 4, 2020, 16);
        Membresia instance = new Membresia();
        instance.setFechaInicio(fechaInicio);
        assertEquals(fechaInicio, instance.getFechaInicio());
    }

    /**
     * Test of setActiva method, of class Membresia.
     */
    @Test
    public void testSetActiva() {
        System.out.println("setActiva");
        boolean activa = false;
        Membresia instance = new Membresia();
        instance.setActiva(activa);
        assertEquals(activa, instance.esActiva());

    }
    
}
