package p1;
import java.util.Scanner;
public class Stu_man_sys{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Total Subject in the class :");
        int Subjects = scanner.nextInt();
        
        int total_Marks = 0;
        
        for (int i = 1; i <= Subjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            total_Marks += marks;
        }
        
        double averagePercentage = (double) total_Marks / (Subjects * 100) * 100;
        
        System.out.println("Total Marks: " + total_Marks);
        System.out.println("Percentage: " + averagePercentage + "%");
        
        String grade;
        
        if (averagePercentage>= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}