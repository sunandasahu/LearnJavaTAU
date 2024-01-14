package chapter3;

import java.util.Scanner;

public class IfStatement_SalaryCalculator {

    public static void main(String[]arg){
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many sales did the employee this week?");
        int numSales= scanner.nextInt();

        if(numSales > quota){
            salary = (salary + bonus);
        }
        System.out.println("Pay salary of $" + salary);
    }
}
