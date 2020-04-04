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
public class SujetoTest {
    
    public SujetoTest() {
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
     * Test of multar method, of class Sujeto.
     */
    @Test
    public void testMultar() {
        System.out.println("multar");
        float multa = 0.0F;
        Sujeto instance = new Sujeto();
        instance.multar(multa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarInteresMensual method, of class Sujeto.
     */
    @Test
    public void testActualizarInteresMensual() {
        System.out.println("actualizarInteresMensual");
        Sujeto instance = new Sujeto();
        instance.actualizarInteresMensual();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esSocio method, of class Sujeto.
     */
    @Test
    public void testEsSocio() {
        System.out.println("esSocio");
        Sujeto instance = new Sujeto();
        boolean expResult = false;
        boolean result = instance.esSocio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
