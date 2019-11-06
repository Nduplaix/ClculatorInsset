/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author talend
 */

@RunWith (Parameterized.class)

public class ValideDateTest {
    private final String date;
    private final boolean isValideDate;
    
    public ValideDateTest (String date, boolean isValideDate){
        this.date=date;
        this.isValideDate=isValideDate;
    }
    
    @Parameters
    public static Collection<Object[]> params(){
        return Arrays.asList(
                new Object[]{"06/11/2019", true},
                new Object[]{"2019/06/11", false},
                new Object[]{"jour/mois/annee", false},
                new Object[]{"06/112019", false},
                new Object[]{"-06/11/2019", false},
                new Object[]{"32/1/19", false},
                new Object[]{"32/11/2019", false},
                new Object[]{null, false}
        );
    }
    
    @Test
    public void testValideDate() {
        boolean result = FieldVerifier.isValidDate(date);
        Assert.assertEquals(isValideDate, result);
    }
    
}
