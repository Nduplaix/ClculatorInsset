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
        Integer iDay, iMonth, iYear;
        String[] s = nbr.split("/");
        iDay=Integer.parseInt(s[0]);
        iMonth=Integer.parseInt(s[1]);
        iYear=Integer.parseInt(s[2]);

        String s1 = "";
        s1 += this.convertArabeToRoman(iDay);
        s1 += "/";
        s1 += this.convertArabeToRoman(iMonth);
        s1 += "/";
        s1 += this.convertArabeToRoman(iYear);

        return s1;
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
        //Implement your code


        String s = "";
        while (nbr >=1000) {
            s += "M";
            nbr -=1000;        }

        while (nbr >=900) {
            s += "CM";
            nbr -=900;        }

        while (nbr >= 500) {
            s += "D";
            nbr -= 500;        }

             while (nbr >=400) {
            s += "CD";
            nbr -=400;        }

             while (nbr >=100) {
            s += "C";
            nbr -=100;        }

             while (nbr >=90) {
            s += "XC";
            nbr -=90;        }

             while (nbr >=50) {
            s += "L";
            nbr -=50;        }

             while (nbr >=40) {
            s += "XL";
            nbr -=40;        }

             while (nbr >=10) {
            s += "X";
            nbr -=10;        }

             while (nbr >=9) {
            s += "IX";
            nbr -=9;        }

             while (nbr >=5) {
            s += "V";
            nbr -=5;        }

             while (nbr >=4) {
            s += "IV";
            nbr -=4;        }

             while (nbr >=1) {
            s += "I";
            nbr -=1;        }

             return s;
    }

}
