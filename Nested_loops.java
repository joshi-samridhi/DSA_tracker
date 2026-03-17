// import java.util.*;

public class Two_inner_loops {

public static void main(String args[])
{
// for(int i =1; i<=4; i++)
//   {
//     for(int j=1; j<=4-i; j++)
//     {
//         System.out.print(" ");

//     }

//    for(int j=1; j<=i; j++)
//     {
//         System.out.print("*");
//     } 

// System.out.println();


// 1
// 12
// 123
// 1234
// 12345


// for(int i =1; i<=5; i++)
// {
//     for(int j= 1; j<=i; j++)
//     {
//         System.out.print(j);
//     }

// System.out.println();    
// }


// 12345
// 1234
// 123
// 12
// 1

// for(int i=5; i>=1; i--)         
// {
//     for(int j=1; j<=i; j++)
//     {
//         System.out.print(j);
//     }

// System.out.println();    
// }

// Scanner s = new Scanner(System.in);

int sum = 0;

for(int i=1; i<=5; i++)
{
    for(int j =1; j<=i; j++)

    {
      
    sum = sum+1;    
    System.out.print(sum + " ");
    

    }   

System.out.println();    
    
}    

}

}


