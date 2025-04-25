/*

This is a Java-based program where the user chooses to start or exit. If started, 
the user can keep entering numbers (0–90), 
and the program keeps adding them until a certain condition is met. 
At the end, it tells the user how well they did based on the total score.

*/

import java.util.Scanner;

public class numberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your value;");

        int choice = sc.nextInt();

        if (choice == 1) {

            int total = 0; 
            System.out.println("Now start entering the values Between 0-90");
            System.out.println("You can stop this program by pressing '0' at any stage.");

         while (true) {

            int input = sc.nextInt();

            total = total + input;

            if ( input == 0){
            System.out.println("Here is your RESULT!");

            break;
            } 

        
            if (input <=0 || input >= 100) {
            System.out.println("Invalid Input");

            continue;
            }

            if (total >= 90 ){

            System.out.println("You are exceding the value");

            break;
            }

            

          } 

          System.out.println("Your Total score is : " + total + " / 100");
          
          if (total == 90){
            System.out.println("Remarks! You are amazing");
          }
          else if (total <= 89 && total >= 50){
            System.out.println("Remarks! You are good");
          }
          if (total <= 49){
            System.out.println("Remarks! You need to work on your self");
          }
          

        } else if (choice == 0) {
            System.out.println("You are out");
        }

        else {
            System.out.println("Invalid value");
        }

        sc.close();

    }

}


/*

OUTPUT:

Enter your value;
1
Now start entering the values Between 0-90
You can stop this program by pressing '0' at any stage.
10
5
11
41
0
Here is your RESULT!
Your Total score is : 67 / 100
Remarks! You are good
 
 
*/
