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
        boolean result = instance.esPagada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaInicio method, of class Membresia.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Membresia instance = new Membresia();
        Fecha expResult = null;
        Fecha result = instance.getFechaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esActiva method, of class Membresia.
     */
    @Test
    public void testEsActiva() {
        System.out.println("esActiva");
        Membresia instance = new Membresia();
        boolean expResult = false;
        boolean result = instance.esActiva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
