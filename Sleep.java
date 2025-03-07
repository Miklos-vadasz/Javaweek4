import java.util.*;
import java.text.NumberFormat;


public class Sleep {
    public static void main(String[]args){  
        int birthdate;
        int bdyear;
        int bdmonth;
        int bdday;
        int year;
        int month;
        int day;
        int daysalive;
        int sleep;
    
        Scanner input = new Scanner(System.in);
        NumberFormat number = NumberFormat.getIntegerInstance();
        System.out.println("Enter your birthdate: ");
        System.out.println("Year: ");
        bdyear = input.nextInt();
        System.out.println("Month: ");
        bdmonth = input.nextInt();
        System.out.println("Day: ");
        bdday = input.nextInt();


        System.out.println("Enter today's date: ");
        System.out.println("Year: ");
        year = input.nextInt();
        System.out.println("Month: ");
        month = input.nextInt();
        System.out.println("Day: ");
        day = input.nextInt();


        daysalive = ((year - bdyear) * 365) + ((month - bdmonth)* 30) + (day - bdday);
        sleep = (daysalive * 8);


        System.out.println ("You have been alive for " + number.format(daysalive) + " days");
        System.out.println("You have slept " + number.format(sleep) + " hours");    
    


    }
    






    
}
