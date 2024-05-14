////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Scanner;

public class App 
{
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter a number");

    int number = myObj.nextInt();
    myObj.close();
    RomanPrinter.print(number);
}
