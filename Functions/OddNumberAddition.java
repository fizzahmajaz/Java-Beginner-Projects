
//we are repeating some steps just to make it readable and easy to debbug
import java.util.Scanner;

public class oddAddition {
    // function to add the odd numbers only
    public static int oddaddition() {
        // making a scanner here
        Scanner sc = new Scanner(System.in);

        // lets take first input
        System.out.println("Enter your value (Press 0 to stop) : ");
        int n = sc.nextInt();

        // declare sum you can delare it in above too.
        int sum = 0;

        // initially checking if the answer is 0 or not this will work on only the first
        // input.
        if (n == 0) {
            System.out.println("Invalid value");
            return -1;
        }

        // this will store the first value if it is not 0
        if (n % 2 == 1) {
            sum = sum + n;
        }

        // now while loop will start working if the first value is not 0
        while (true) {
            n = sc.nextInt();

            if (n == 0) {
                break;
            }
            // it will add all the odd value only
            if (n % 2 == 1) {
                sum = sum + n;
            }
        }

        return sum;

    }

    public static void main(String args[]) {

        // Here we are storing the function into new variable
        int result = oddaddition();

        // if the answer is not 0 then it will print the result
        if (result != -1) {

            System.out.println("Your answer is : " + result);

        }

        // Second approach : System.out.println("Your answer is : " + result);
    }

}

/*
 * OUTPUT:
 * 
 * Enter your value (Press 0 to stop) :
 * 1
 * 2
 * 5
 * 0
 * Your answer is : 6
 */

