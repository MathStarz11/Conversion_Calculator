/*
 *  Copyright 2017 Christopher Todd
 */

package main;

// @author christophertodd

public class ConversionFunctions {
    char hexArray[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    String binArray[] = {"0000","0001","0010","0011","0100","0101","0110","0111","1000",
                            "1001","1010","1011","1100","1101","1110","1111"};
    //Constructor
    public ConversionFunctions() {
    
    }
    
    //convert Binary to Decimal
    public String binDec(String string) {
        String strg = string;
        int sum = 0;
        int index = 0;
        for(int i = strg.length() - 1; i >= 0; i--) {
            if(strg.charAt(i) == '1') {
                sum = (int) (sum + Math.pow(2,index));
            }
            index++;
        }
        strg = Integer.toString(sum);
        return strg;
    }
    
    //convert Decimal to Binary
    public String decBin(String string) {
        String strg;
        int dec = Integer.parseInt(string);
        String bin = "";
        while(dec != 0) {
            if(dec % 2 == 0)
                bin += "0";
            else
                bin += "1";
            
            dec /= 2;
        }
        strg = new StringBuffer(bin).reverse().toString();

        return strg;
    }
    
    //convert Hexidecimal to Binary
    public String hexBin(String string) {
        String strg = string;
        String bin = "";
        
        for(int i = 0; i < strg.length(); i++) {
            for(int j = 0; j < 16; j++) {
                if(strg.charAt(i) == hexArray[j]) {
                    bin = bin + binArray[j];
                    break;
                }
            }
        }
        
        return bin;
    }
    
    //convert Binary to Hexidecimal
    public String binHex(String string) {
        String strg = string;
        String hex = "";
        
        //Check for no remainder for divisible by 4 of the string length
        if(strg.length() % 4 != 0) {
            int x = strg.length() % 4;
            
            for(int i = 0; i < 4 - x; i++) {
                strg = "0" + strg;
            }  
        }
        
        for(int i = strg.length()/4; i > 0; i--) {
            String fourDigits = strg.substring(4 * (i-1), 4 * i);
            hex =  hexArray[Integer.parseInt(String.valueOf(binDec(fourDigits)))] + hex;
        }
        
        return hex;
    }
    
    //convert Decimal to Hexidecimal
    public String decHex(String string) {
        return binHex(decBin(string));
    }
    
    //convert Hexidecimal to Decimal
    public String hexDec(String string) {
        return binDec(hexBin(string));
    }
    
}
