////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){

        char[] letters = romanNumber.toCharArray();
        //int n=romanNumber.length();
        String str = "";
        for (int i = 0; i<6; i++){
            for (int j=0; j<letters.length; j++){
                if (letters[j]=='I'){
                    switch(i){
                        case 0: str= str + " _____  "; break;
                        case 1: str= str +"|_   _| "; break;
                        case 2: str= str +"  | |   "; break;
                        case 3: str= str +"  | |   "; break;
                        case 4: str= str +" _| |_  "; break;
                        case 5: str= str +"|_____| "; break;
                    }
                }
                if (letters[j]=='V'){
                    switch(i){
                        case 0: str = str + "__      __ "; break;
                        case 1: str = str + "\\ \\    / / "; break;
                        case 2: str = str + " \\ \\  / /  "; break;
                        case 3: str = str + "  \\ \\/ /   "; break;
                        case 4: str = str + "   \\  /    "; break;
                        case 5: str = str + "    \\/     "; break;
                    }
                }
                if (letters[j]=='X'){
                    switch(i){
                        case 0: str = str + "__   __ "; break;
                        case 1: str = str + "\\ \\ / / "; break;
                        case 2: str = str + " \\ V /  "; break;
                        case 3: str = str + "  > <   "; break;
                        case 4: str = str + " / . \\  "; break;
                        case 5: str = str + "/_/ \\_\\ "; break;
                    }
                }
                if (letters[j]=='L'){
                    switch(i){
                        case 0: str = str + " _       "; break;
                        case 1: str = str + "| |      "; break;
                        case 2: str = str + "| |      "; break;
                        case 3: str = str + "| |      "; break;
                        case 4: str = str + "| |____  "; break;
                        case 5: str = str + "|______| "; break;
                    }
                }
                if (letters[j]=='C'){
                    switch(i){
                        case 0: str = str + "  _____  "; break;
                        case 1: str = str + " / ____| "; break;
                        case 2: str = str + "| |      "; break;
                        case 3: str = str + "| |      "; break;
                        case 4: str = str + "| |____  "; break;
                        case 5: str = str + " \\_____| "; break;
                    }
                }
                if (letters[j]=='D'){
                    switch(i){
                        case 0: str = str + " _____   "; break;
                        case 1: str = str + "|  __ \\  "; break;
                        case 2: str = str + "| |  | | "; break;
                        case 3: str = str + "| |  | | "; break;
                        case 4: str = str + "| |__| | "; break;
                        case 5: str = str + "|_____/  "; break;
                    }
                }
                if (letters[j]=='M'){
                    switch(i){
                        case 0: str = str + " __  __  "; break;
                        case 1: str = str + "|  \\/  | "; break;
                        case 2: str = str + "| \\  / | "; break;
                        case 3: str = str + "| |\\/| | "; break;
                        case 4: str = str + "| |  | | "; break;
                        case 5: str = str + "|_|  |_| "; break;
                    }
                }
            }
            str += "\n";
        }

        return str;
    }
}