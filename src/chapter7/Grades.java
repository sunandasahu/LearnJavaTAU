package chapter7;

// User should enter the number of grades in the array.
// Calculate the average, highest and lowest grade

import java.util.Scanner;

public class Grades {
   private static Scanner scanner = new Scanner(System.in);
   private static int grades[];


    public static void main(String[]args){
        System.out.println("How many grades do you want to enter?");
       grades =new int[ scanner.nextInt()];
        getGrades();
        System.out.println("AverageGrade: "+String.format("%.2f" , averageGrade()));
        System.out.println("Highest Grade: "+ getHighest());
        System.out.println("Lowest Grade: "+ getLowest());

    }
    public static void getGrades(){
      for(int i=0; i<grades.length; i++){
          System.out.println("Enter grade #" +(i+1));
          grades[i] = scanner.nextInt();
      }
    }
    public static int calculateTotalGrades(){
        int totalGrades=0;
        for (int grade : grades){
        totalGrades= totalGrades+grade;
        }
        return totalGrades;
    }
    public static double averageGrade(){
       return calculateTotalGrades()/grades.length;
    }
    public static int getHighest(){
        int highest = grades[0];
        for(int grade : grades){
            if (grade>highest){
                highest = grade;
            }
        }return highest;
    }
    public static int getLowest(){
        int lowest = grades[0];
        for(int grade : grades){
            if (grade<lowest){
                lowest = grade;
            }
        }return lowest;
    }
}
