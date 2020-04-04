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
        instance.setCancha(expResult);
        int result = instance.getCancha();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFecha method, of class Reserva.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Reserva instance = new Reserva();
        Fecha expResult = new Fecha();
        expResult.setFecha(12, 4, 2020, 16);
        instance.setFecha(expResult);
        Fecha result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoste method, of class Reserva.
     */
    @Test
    public void testGetCoste() {
        System.out.println("getCoste");
        Reserva instance = new Reserva();
        float expResult = 0.0F;
        instance.setCoste(expResult);
        float result = instance.getCoste();
        assertEquals(expResult, result, 0.0);
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
        assertEquals(cancha, instance.getCancha());
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
        assertEquals(fecha, instance.getFecha());
    }

    /**
     * Test of setCoste method, of class Reserva.
     */
    @Test
    public void testSetCoste() {
        System.out.println("setCoste");
        float coste = 0.0F;
        Reserva instance = new Reserva();
        assertEquals(coste, instance.getCoste(), 0);
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
        assertEquals(sujeto, instance.getSujeto());

    }

    /**
     * Test of getSujeto method, of class Reserva.
     */
    @Test
    public void testGetSujeto() {
        System.out.println("getSujeto");
        Reserva instance = new Reserva();
        Sujeto expResult = null;
        instance.setSujeto(expResult);
        Sujeto result = instance.getSujeto();
        assertEquals(expResult, result);
    }
    
}
