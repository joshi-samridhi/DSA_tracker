import java.util.*;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter First number:");
        int a = s.nextInt();

        System.out.println("Enter Second number:");
        int b= s.nextInt();
        
        System.out.println("Please select operations by giving number \n 1. Addition\n 2. Subtraction\n");
        int c;
        int choice = s.nextInt();

        switch (choice) 
        {
            case 1:
                c= a+b;             
             System.out.println("Addition " + c);
                break;

            case 2:
                c=a-b;
                System.out.println("Subtraction " + c);
                break;    
        
            default:
                break;
        }
    }
}
