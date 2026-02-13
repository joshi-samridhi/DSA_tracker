import java.util.*;
public class Practice {

public static void main(String[] args)
{

    // for(; ;)    !!!INFINITE LOOP!!!
    // {
    //     System.out.println("Apna College");
    // }

Scanner s = new Scanner(System.in);
System.out.println("Enter your Marks");
int input;
     
do{
    int marks = s.nextInt();
    if(marks >= 90 && marks <=100)
    {
        System.out.println("This is good");
    }

    else if(marks>= 60 && marks<=89)
    {
       System.out.println("This is also good");
    }
    
    else if(marks>= 0 && marks<=59)

        {
            System.out.println("This is also good as well");

        }

    else
    {

        System.out.println("Invalid");
    }  
    
    System.out.println("Want to continue ? (Yes (1) or No(2)");
    input = s.nextInt();

} while (input == 1);
    
}

}
    

