/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.RomanConverterService;
import org.insset.shared.FieldVerifier;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        //Implement your code
        return "XV/III/MX";
    }
    
    static int RomanCharToValue(char vv)
    {
        switch (vv)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }


    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        int oc,NewRV,OldRV=0,Result=0;
        
        for (oc=0;oc<nbr.length();oc++)
        {
            NewRV = RomanCharToValue(nbr.toCharArray()[oc]);
            
            if (NewRV > OldRV)
            {
                Result+=NewRV-(OldRV<<1);
            }else
            {
                Result+=NewRV;
            }//endif
            OldRV=NewRV;
        }//endfor
        return Result;
    }

    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        //Matthieu
        return new String("XVXX");
    }

}
