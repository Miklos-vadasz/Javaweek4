import java.util.*;
public class Thing {

    public static void main(String[]args){

        String name;
        String password;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter your name: ");
        name = input.next();
        System.out.print("Enter your password: ");
        password = input.next();

        System.out.println("Your name is: "+ name);
        System.out.println("Your name is "+ password);



    }
    
}
