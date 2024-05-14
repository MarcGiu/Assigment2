package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){

        char[] letters = romanNumber.toCharArray();
        //int n=romanNumber.length();
        for (int i = 0; i<6; i++){
            for (int j=0; j<letters.length; j++){
                if (letters[j]=='I'){
                    switch(i){
                        case 0: System.out.print(" _____  ");
                        case 1: System.out.print("|_   _| ");
                        case 2: System.out.print("  | |   ");
                        case 3: System.out.print("  | |   ");
                        case 4: System.out.print(" _| |_  ");
                        case 5: System.out.print("|_____| ");
                    }
                }
                if (letters[j]=='V'){
                    switch(i){
                        case 0: System.out.print("__      __ ");
                        case 1: System.out.print("\\ \\    / / ");
                        case 2: System.out.print(" \\ \\  / /  ");
                        case 3: System.out.print("  \\ \\/ /   ");
                        case 4: System.out.print("   \\  /    ");
                        case 5: System.out.print("    \\/     ");
                    }
                }
                if (letters[j]=='X'){
                    switch(i){
                        case 0: System.out.print("__   __ ");
                        case 1: System.out.print("\\ \\ / / ");
                        case 2: System.out.print(" \\ V /  ");
                        case 3: System.out.print("  > <   ");
                        case 4: System.out.print(" / . \\  ");
                        case 5: System.out.print("/_/ \\_\\ ");
                    }
                }
            }
            System.out.println();
        }

        return null;
    }
}