package chapter3;

import java.util.Scanner;

public class IfElseIf_TestResult {
    public static void main(String [] arg){
        //get the score

        System.out.println("Enter your score");
        Scanner scanner = new Scanner(System.in);
        int testScore = scanner.nextInt();
        char grade;

        //Determine the Lettter grade
        if(testScore >= 90){
            grade = 'A';
        }else if(testScore >= 80){
            grade = 'B';
        }else if (testScore >= 70){
            grade = 'C';
        }else{
            grade = 'F';
        }
        System.out.println("Your Grade is "+ grade);


    }

}
