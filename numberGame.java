import java.util.Scanner;

public class numberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your value;");

        int choice = sc.nextInt();

        if (choice == 1) {

            int total = 0; 
            System.out.println("Now start entering the value Between 0-100");

         while (true) {

            int input = sc.nextInt();

            if ( input == 0){
            System.out.println("You quite this");

            break;
            } 

        
            if (input <=0 || input >= 100) {
            System.out.println("Invalid Input");

            continue;
            }

            total = total + input;

            if (total >= 90 ){

            System.out.println("You are exceding the value");

            break;
            }

            System.out.println("Total score : " + total + "out of 100");

          } 
          
          if (total == 90){
            System.out.println("You are amazing");
          }
          else if (total <= 89 || total >= 50){
            System.out.println("You are good");
          }
          if (total <= 49){
            System.out.println("You need to work on your self");
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
