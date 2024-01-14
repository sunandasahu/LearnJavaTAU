package chapter3;

import java.util.Scanner;

public class Switch_GradeMessage {
    public static void main(String[] args){
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;

        switch (grade){
            case "A":
                message = "Excellent job!!";
                break;
            case "B":
                message = "Good job!!";
                break;
            case "C":
                message = "Need improvements!!";
                break;
            case "F":
                message = "Sorry!! Try next time";
                break;
            default:
                message = "Enter a valid grade";
                break;
        }
        System.out.println(message);


    }
}
