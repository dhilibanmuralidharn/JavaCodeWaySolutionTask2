import java.util.*;

class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of subjects :");
        int numSubjects = input.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects;i++){
            System.out.println("Enter the marks obtained in subject " + i + ": ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks /numSubjects;
        String grade;

        if (averagePercentage >= 90){
            grade = "A";
        } else if (averagePercentage >= 80 && averagePercentage < 90) {
            grade = "B";
        } else if (averagePercentage >= 70 && averagePercentage < 80) {
            grade = "C";
        }
        else {
            grade = "D";
        }
        System.out.println("TotalMarks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade Of The Student is : " + grade);
    }
}