/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

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
public class RomanConverterServiceImplTest {
    
    public RomanConverterServiceImplTest() {
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
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman() {
        System.out.println("convertArabeToRoman");
        
        Integer nbr = 1;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "I";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
        nbr = 5;
        expResult = "V";
        result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
        nbr = 1001;
        expResult = "MI";
        result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
        nbr = 1999;
        expResult = "MCMXCIX";
        result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
        nbr = 1604;
        expResult = "MDCIV";
        result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
        nbr = 460;
        expResult = "CDLX";
        result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
        nbr = 45;
        expResult = "XLV";
        result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
        nbr = 11;
        expResult = "XI";
        result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
    }
    
}
