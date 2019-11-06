/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

import java.util.Arrays;
import java.util.Collection;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author talend
 */
@RunWith(Parameterized.class)
public class RomanParameterTest {

    @Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(
                new Object[]{"V", true},
                new Object[]{"10", false},
                new Object[]{"hello", false},
                new Object[]{"IVM", false},
                new Object[]{null, false}
                
                
        );
    }


    private final String nombre;
    private final boolean isValidRoman;

    public RomanParameterTest(String nombre, boolean isValidRoman) {
        this.nombre = nombre;
        this.isValidRoman = isValidRoman;
    }
       
    @Test
    public void testIsValidRoman(){
        //FieldVerifier instance = new FieldVerifier();
        boolean result = FieldVerifier.isValidRoman(this.nombre);
        assertEquals(this.isValidRoman, result);
    }
}

