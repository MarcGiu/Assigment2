////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    // Converte i numeri interi nel range [1,6] in numeri romani
    public static String convert(int number){

        if (number<1 || number>6) {
            throw new IllegalArgumentException(number + " is not in range [1,6]");
        }

        String roman="";

        while (number!=0){
            if (number>=5) {
                roman = roman + "V";
                number = number - 5;
            }
            else if (number>=4){
                roman=roman+"IV";
                number=number-4;
            }
            else {
                roman=roman+"I";
                number--;
            }
        }

        return roman;
    }
}
