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
        float multa = 15000;
        Sujeto instance = new Sujeto(true, 5000, null, null);
        instance.multar(multa);
        assertEquals(multa+5000, instance.getMulta(), 0);
    }

    /**
     * Test of actualizarInteresMensual method, of class Sujeto.
     */
    @Test
    public void testActualizarInteresMensual() {
        System.out.println("actualizarInteresMensual");
        Sujeto instance = new Sujeto(true, 5000, null, null);
        float expResult = (float) (instance.getMulta()+instance.getMulta()*0.1);
        instance.actualizarInteresMensual();
        assertEquals(instance.getMulta(), 5500, 0);
    }

    /**
     * Test of esSocio method, of class Sujeto.
     */
    @Test
    public void testEsSocio() {
        System.out.println("esSocio");
        Sujeto instance = new Sujeto(true, 5000, null, null);
        boolean expResult = true;
        boolean result = instance.esSocio();
        assertEquals(expResult, result);
    }
    
}
