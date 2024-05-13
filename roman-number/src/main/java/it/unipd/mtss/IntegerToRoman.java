////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    // Converte i numeri interi nel range [1,3] in numeri romani
    public static String convert(int number){

        if (number<1 || number>3) {
            throw new IllegalArgumentException(number + " is not in range [1,3]");
        }

        String roman="";

        while (number!=0){
            roman=roman+"I";
            number--;
        }
        return roman;
    }
}
