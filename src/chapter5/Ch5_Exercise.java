package chapter5;

//Enter base cost of the plan:
//        82.45
//        Enter overage minutes:
//        9
//        Phone Bill Statement
//        Plan: $82.45
//        Overage: $2.25
//        Tax: $12.71
//        Total: $97.41
import java.util.Scanner;
public class Ch5_Exercise {
   //Get what you know
   static double overAgeChargePerMinute = 0.25;
    static double TaxRate = .15;


    public static void main(String []args){

         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of plan:");
         double baseCost = scanner.nextDouble();

        System.out.println("Enter overAge minutes:");
         int overAgeMinute = scanner.nextInt();
         scanner.close();


        double overAgeCharge = calculateOveAgeFees(overAgeMinute);
        double totalTax = calculateTax(baseCost+ overAgeCharge);
        calculateAndPrintBill(baseCost,overAgeCharge,totalTax);

    }

    public static double calculateOveAgeFees(int overAgeMinute){
        double overAgeFee = overAgeMinute * overAgeChargePerMinute;
        return overAgeFee;
    }

    public static double calculateTax(double totalBaseFee){
        double totalTax = totalBaseFee * TaxRate;
        return totalTax;
    }
    public static void calculateAndPrintBill(double base, double overage, double tax){
        double finalTotal = base + overage + tax;



        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));



    }



}
