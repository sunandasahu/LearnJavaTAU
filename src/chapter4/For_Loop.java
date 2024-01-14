package chapter4;

import java.util.Scanner;

public class For_Loop {
    /*
     * FOR LOOP:
     * Write a cashier program that will scan a given number of items and tally the cost.
     */
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("How many items do you want to scan?");
        int quantity = scanner.nextInt();

        Double total=0.0;
        for(int i=0; i< quantity; i++){
            System.out.println("What is the cost of the item?");
            Double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("Your total cost is $" +total);

    }

}
