package chapter3;

import java.util.Scanner;

public class LoanCalculator {

    /*
    Nested_If
    Loan requirement salary-$30,000
    years employed 2yrs
     */
    public static void main(String[]arg){
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary= scanner.nextDouble();
        System.out.println("Enter number of years employed");
        int yearsEmployed = scanner.nextInt();

        if(salary >= requiredSalary){
            if(yearsEmployed >= requiredYearsEmployed) {
                System.out.println("Congratulations !! You qualify for the loan");
            }else{
                System.out.println("Sorry!! You must have to be employed for "+ requiredYearsEmployed + " years");
            }
        }else{
            System.out.println("Sorry!! You must have to have $"+requiredSalary + " annual salary");
        }
//        if(salary >= requiredSalary || yearsEmployed >= requiredYearsEmployed){
//            System.out.println("Congratulations !! You qualify for the loan");
//        }else {
//            System.out.println("Sorry!! You do not qualify for the loan");
//        }
    }
}
