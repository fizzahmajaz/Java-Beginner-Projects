import java.util.*;
public class evenNumbers {

    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your value");
        int n = sc.nextInt();



        System.out.println("Even numbers till " + n + ":");

        for (int i = 2; i <= n; i=i+2 ){

            System.out.println(i);
        }


        /*

        If you want to use remainder (%) Then:
        
        for (int i=1; i<=n; i++){

             if (i % 2 == 0) {

                System.out.println(i);
          
          }
        } 
          


        OUTPUT:

        Enter your value
        17
        Even numbers till 17:
        2
        4
        6
        8
        10
        12
        14
        16

        */


    }
    
}

