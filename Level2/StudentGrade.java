import java.util.Random;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int numStudents = 10; 
        int[][] marks = generateMarks(numStudents); 
        double[][] results = calculateResults(marks); 
        String[][] grades = calculateGrades(results); 

        // Display scorecard
        displayScorecard(marks, results, grades);
    }

    // Method to generate random marks for Physics, Chemistry, and Maths
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            marks[i][0] = rand.nextInt(41) + 60;
            marks[i][1] = rand.nextInt(41) + 60; 
            marks[i][2] = rand.nextInt(41) + 60; 
        }
        return marks;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][4];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total; 
            results[i][1] = average; 
            results[i][2] = percentage; 
        }
        return results;
    }

    // Method to calculate grades based on percentage
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A"; 
            } else if (percentage >= 70) {
                grades[i][0] = "B"; 
            } else if (percentage >= 60) {
                grades[i][0] = "C"; 
            } else if (percentage >= 50) {
                grades[i][0] = "D"; 
            } else if (percentage >= 40) {
                grades[i][0] = "E"; 
            } else {
                grades[i][0] = "R"; 
            }
        }
        return grades;
    }

    // Method to display scorecard for all students
    public static void displayScorecard(int[][] marks, double[][] results, String[][] grades) {
        System.out.println("Student Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t\t" + marks[i][1] + "\t\t" + marks[i][2]
                    + "\t" + results[i][0] + "\t" + Math.round(results[i][1] * 100.0) / 100.0 + "\t"
                    + Math.round(results[i][2] * 100.0) / 100.0 + "%\t\t" + grades[i][0]);
        }
    }
}
