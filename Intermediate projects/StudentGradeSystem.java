//Bismillah
import java.util.Scanner;
public class studentGradeSystem {

    //Function 1 - Calculate Total
    public static int calculateTotal(int[] marks){
        int total= 0;

        for (int score : marks){
            total = total + score;
        }

        return total;
    }

    //Function 2 - Percentage
    public static double calculatePercentage(int total, int numbersOfSubject){
        double Percentage = (double) total/numbersOfSubject;
        
        return Percentage;
    }

    //Function 3 - Calculate Grades
    public static String calculateGrades(double percentage){
        if(percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    //Let's Start with main
    public static void main (String args []){
        //Take name as input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Student's Name : ");
        String name = sc.nextLine();

        //Take the number of subjects
        int numSubjects;
        do {
            System.out.println("Enter numbers of subjects (Between 2 - 10): ");
            numSubjects = sc.nextInt();

        }while ( numSubjects <= 2 && numSubjects >= 10);

        //Take input marks
        int [] marks = new int [numSubjects];
        for (int i = 0; i < numSubjects; i ++){
            System.out.println("Enter marks of Subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }

        //Lets Process the data
        int total = calculateTotal(marks);
        double percentage = calculatePercentage(total, numSubjects);
        String grades = calculateGrades(percentage);

        //lets make a report

        StringBuilder report = new StringBuilder();

        report.append("\n--- Student Report ---\n");
        report.append("Name :").append(name).append("\n");
        for (int i = 0; i<numSubjects; i++){
            report.append("Subject ").append(i+1).append(": ").append(marks[i]).append("\n");
        }
        report.append("Total marks: ").append(total).append("\n");
        report.append("Percentage: ").append(percentage).append("%").append("\n");
        report.append("Grade: ").append(grades).append("\n");

        System.out.println(report);

        sc.close();



    }


    
}

