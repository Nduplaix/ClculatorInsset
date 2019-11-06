/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import java.util.Arrays;
import java.util.Collection;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author talend
 */
@RunWith(Parameterized.class)
public class RomanToArabTest {
    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(
                new Object[]{"V", 5},
                new Object[]{"IV", 4},
                new Object[]{"X", 10},
                new Object[]{"L", 50}
        );
    }


    private final String nombre;
    private final int isValidRoman;

    public RomanToArabTest(String nombre, int isValidRoman) {
        this.nombre = nombre;
        this.isValidRoman = isValidRoman;
    }
       
    @Test
    public void testIsValidRoman(){
        //FieldVerifier instance = new FieldVerifier();
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        int result = instance.convertRomanToArabe(this.nombre);
        assertEquals(this.isValidRoman, result);
    }
}

