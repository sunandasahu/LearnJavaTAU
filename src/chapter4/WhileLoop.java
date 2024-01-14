package chapter4;

import java.util.Scanner;

public class WhileLoop {
    // Validating the number of hours work and calculate the gross salary.

    public static void main(String []args){
        // declared the known data.
     int hourlyRate = 15;
     int maxHours = 40;

     //Get users input
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        int numHoursWorked = scanner.nextInt();

        //verify hour worked
        while(numHoursWorked > maxHours || numHoursWorked < 1){
            System.out.println("Invalid hours worked. Please try again!");
            numHoursWorked = scanner.nextInt();
        }
        scanner.close();

        //Calculate gross pay
        double grossPay = numHoursWorked * hourlyRate ;
        System.out.println("Your gross salary is $" + grossPay);

    }
}
