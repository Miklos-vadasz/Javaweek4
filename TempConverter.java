
import java.util.*;
public class TempConverter {

public static void main(String[]args){
    double fahrenheit;
    double celcius; 

    Scanner input = new Scanner(System.in);

    System.out.println("Enter Fahrenheit");
    fahrenheit = input.nextInt();

    System.out.println("Enter Celcius");
    celcius = input.nextInt();

    celcius = 5/9 * (fahrenheit - 32);

    System.out.println("Celcius is: " + celcius);

}

    
    
}
