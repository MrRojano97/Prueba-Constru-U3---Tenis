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
public class FechaTest {
    
    public FechaTest() {
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
     * Test of getDia method, of class Fecha.
     */
    @Test
    public void testGetDia() {
        System.out.println("getDia");
        Fecha instance = new Fecha();
        int expResult = 12;
        instance.setFecha(expResult, expResult, expResult, expResult);
        int result = instance.getDia();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMes method, of class Fecha.
     */
    @Test
    public void testGetMes() {
        System.out.println("getMes");
        Fecha instance = new Fecha();
        int expResult = 4;
        instance.setFecha(expResult, expResult, expResult, expResult);
        int result = instance.getMes();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAnio method, of class Fecha.
     */
    @Test
    public void testGetAnio() {
        System.out.println("getAnio");
        Fecha instance = new Fecha();
        int expResult = 2020;
        instance.setFecha(expResult, expResult, expResult, expResult);
        int result = instance.getAnio();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHora method, of class Fecha.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Fecha instance = new Fecha();
        int expResult = 16;
        instance.setFecha(expResult, expResult, expResult, expResult);
        int result = instance.getHora();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class Fecha.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        int dia = 12;
        int mes = 4;
        int anio = 2020;
        int hora = 16;
        Fecha instance = new Fecha();
        instance.setFecha(dia, mes, anio, hora);
        
        assertEquals(12, instance.getDia());
        assertEquals(4, instance.getMes());
        assertEquals(2020, instance.getAnio());
        assertEquals(16, instance.getHora());
        
    }
    
}
