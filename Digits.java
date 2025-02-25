/*2/25/25, Miklos Vadasz Digets*/

public class Digits{

public static void main(String[]args){

    int number;
    number = 258;
    int ones;
    int tens;
    int hundreds;
    ones = number % 10;
    tens = (number / 10) % 10;
    hundreds = (number / 10 / 10) % 10;
    
    System.out.println(ones);
    System.out.println(tens);
    System.out.println(hundreds);
}
 }