package chapter3;

import java.util.Scanner;

public class IfElse_QuotaCalculator {
    /*
    If-else
    all employee should have atleast 10 sales
    If they did , they will receive a congratulate msg.
    if not they will get notified how many sale shot
     */
    public static void main(String[]arg){
        int quota = 10;
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many sales did the employee do this week?");
        int numSales= scanner.nextInt();

        if(numSales >= quota ){
            System.out.println("Congratulations !! You have completed your target sales");
        }else {
            int shotSales= quota - numSales;
            System.out.println("You have made " + shotSales + " sales less than targeted");
        }
    }
}
