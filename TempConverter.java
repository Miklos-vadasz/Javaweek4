
import java.util.*;
public class TempConverter {

public static void main(String[]args){
    double fahrenheit;
    double celcius; 

    Scanner input = new Scanner(System.in);

    System.out.println("Enter Fahrenheit");
    fahrenheit = input.nextInt();

    celcius = 5.0/9.0 * (fahrenheit - 32.0);

    System.out.println("Celcius is: " + celcius);

}

    
    
}
