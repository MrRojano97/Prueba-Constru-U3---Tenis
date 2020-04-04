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
public class ReservaTest {
    
    public ReservaTest() {
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
     * Test of getCancha method, of class Reserva.
     */
    @Test
    public void testGetCancha() {
        System.out.println("getCancha");
        Reserva instance = new Reserva();
        int expResult = 0;
        int result = instance.getCancha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Reserva.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Reserva instance = new Reserva();
        Fecha expResult = null;
        Fecha result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoste method, of class Reserva.
     */
    @Test
    public void testGetCoste() {
        System.out.println("getCoste");
        Reserva instance = new Reserva();
        float expResult = 0.0F;
        float result = instance.getCoste();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCancha method, of class Reserva.
     */
    @Test
    public void testSetCancha() {
        System.out.println("setCancha");
        int cancha = 0;
        Reserva instance = new Reserva();
        instance.setCancha(cancha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Reserva.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Fecha fecha = null;
        Reserva instance = new Reserva();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoste method, of class Reserva.
     */
    @Test
    public void testSetCoste() {
        System.out.println("setCoste");
        float coste = 0.0F;
        Reserva instance = new Reserva();
        instance.setCoste(coste);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSujeto method, of class Reserva.
     */
    @Test
    public void testSetSujeto() {
        System.out.println("setSujeto");
        Sujeto sujeto = null;
        Reserva instance = new Reserva();
        instance.setSujeto(sujeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
