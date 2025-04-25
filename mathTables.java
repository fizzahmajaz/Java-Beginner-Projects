import java.util.*;

public class mathTables{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        for(int i = 0; i <= 10; i++)

        System.out.println(n + "+" + i + "=" + (i*n));

    }
}


/*OUTPUT:

Enter a number: 2
2+0=0
2+1=2
2+2=4
2+3=6
2+4=8
2+5=10
2+6=12
2+7=14
2+8=16
2+9=18
2+10=20

*/

