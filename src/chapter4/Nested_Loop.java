package chapter4;

import java.util.Scanner;

public class Nested_Loop {
    public static void main(String[] args){
        int numberOfStudents = 24;
        int numberOfSubject = 4;

        for(int i=0; i< numberOfStudents; i++ ){
            double total = 0;
            for(int j=0;j<numberOfSubject; j++){
                Scanner scanner = new Scanner(System.in);
                System.out.println("What is the score of test #"+(j+1)+" ?");
                double testScore = scanner.nextDouble();
                total = total+testScore;

            }
            double averageScore = total/ numberOfSubject;
            System.out.println("The average score of student #" + (i+1) + " is " + averageScore);
        }

    }
}
