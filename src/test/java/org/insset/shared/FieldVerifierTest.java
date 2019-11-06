/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class FieldVerifierTest {
    
    public FieldVerifierTest() {
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
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimal() {
        System.out.println("isValidDecimal");
        
        Integer nbr = 1;
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);

        nbr = -1;
        expResult = false;
        result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
        
        nbr = 0;
        expResult = false;
        result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
        
        nbr = 2000;
        expResult = false;
        result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
        
        nbr = 1999;
        expResult = true;
        result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
        
        nbr = null;
        expResult = false;
        result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
    }
    
    
}
