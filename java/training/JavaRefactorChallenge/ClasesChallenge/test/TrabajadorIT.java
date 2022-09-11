/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author feder
 */
public class TrabajadorIT {
    
    public TrabajadorIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setSalario method, of class Trabajador.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        int salario = 0;
        Trabajador instance = new Trabajador();
        instance.setSalario(salario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalario method, of class Trabajador.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Trabajador instance = new Trabajador();
        int expResult = 0;
        int result = instance.getSalario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
