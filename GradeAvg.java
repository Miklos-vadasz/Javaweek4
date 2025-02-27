/*Miklos Vadasz, 2/27/2025, grade average*/

import java.util.*;
public class GradeAvg {

    

    public static void main(String[]args){

        double grade1;
    double grade2;
    double grade3;
    double grade4;
    double grade5;
    double average;




    Scanner input = new Scanner(System.in);
    System.out.println("Enter a grades ");
    grade1 = input.nextInt();
    System.out.println("Enter a grades ");
    grade2 = input.nextInt();
    System.out.println("Enter a grades ");
    grade3 = input.nextInt();
    System.out.println("Enter a grades ");
    grade4 = input.nextInt();
    System.out.println("Enter a grades ");
    grade5 = input.nextInt();


    average = (grade1 + grade2 + grade3 + grade4 + grade5) /5.0;
    System.out.println("Your avg is " + average);




    }
    
}
