/*2/25/25, Miklos Vadasz Digets*/

import java.util.*;

public class Digits{

public static void main(String[]args){

    int number;
    /*number = 2584;*/
    int ones;
    int tens;
    int hundreds;
    int thousands;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a 4 digits number");
    number = input.nextInt();

    ones = number % 10;
    tens = (number / 10) % 10;
    hundreds = (number / 10 / 10) % 10;
    thousands = (number / 10 / 10 / 10) % 10;
    

    System.out.println(thousands);
    System.out.println(hundreds);
    System.out.println(tens);
    System.out.println(ones);

    System.out.println("The thousands digit is " + thousands);
    System.out.println("The hundreds digit is " + hundreds);
    System.out.println("The tens digit is " + tens);
    System.out.println("The ones digit is " + ones);
    
    
}
 }