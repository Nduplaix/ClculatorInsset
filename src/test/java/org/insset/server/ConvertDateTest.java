/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import java.util.Arrays;
import java.util.Collection;
import org.insset.shared.FieldVerifier;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author talend
 */
@RunWith(Parameterized.class)
public class ConvertDateTest {
    private final String date;
    private final String isValideDate;
    
    public ConvertDateTest (String date, String isValideDate){
        this.date=date;
        this.isValideDate=isValideDate;
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> params(){
        return Arrays.asList(
                new Object[]{"06/11/2019", "VI/XI/MMXIX"},
                new Object[]{"12/05/2011", "XII/V/MMXI"},
                new Object[]{"29/06/1997", "XXIX/VI/MCMXCVII"}
             
        );
    }
    
    @Test
    public void testValideDate() {
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String result = instance.convertDateYears(date);
        Assert.assertEquals(isValideDate, result);
    }
}
