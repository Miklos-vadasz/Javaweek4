import java.util.*;
public class Election {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        

        double NYM;
        double NJM;
        double CNM; 
        double NYA;
        double NJA;
        double CNA; 
        double totalVotes; 
        double Awbrey;
        double Martinez;
        double averageA;
        double averageM;
        


        System.out.print("Enter NYM votes: ");
        NYM = input.nextInt();
        System.out.print("Enter NJM votes: ");
        NJM = input.nextInt();
        System.out.print("Enter CNM votes: ");
        CNM = input.nextInt();

        System.out.print("Enter NYA votes: ");
        NYA = input.nextInt();
        System.out.print("Enter NJA votes: ");
        NJA = input.nextInt();
        System.out.print("Enter CNA votes: ");
        CNA = input.nextInt();

        Martinez = NYM + NJM + CNM;
        Awbrey = NYA + NJA + CNA;
        totalVotes = Martinez + Awbrey;

        averageA = (Awbrey/totalVotes) * 100;
        averageM = (Martinez/totalVotes) * 100;


        System.out.println("Candidate\tVotes   Percentage");
        System.out.println("Awbrey\t\t" + Awbrey + "   \t" +  averageA);
        System.out.println("Martinez\t" + Martinez + "   \t" +  averageM);




        






    }
    
}
