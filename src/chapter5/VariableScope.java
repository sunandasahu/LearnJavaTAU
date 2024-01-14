package chapter5;

import java.util.Scanner;
// Scope of variables
//instant Credit Check
public class VariableScope {
   // Get what you know
   static int requiredCreditScore = 700;
    static double requiredSalary = 25000;
    static Scanner scanner = new Scanner(System.in);
     static boolean approveCreditCard = false;

     //Get what we don't know

        public static void main(String [] args){
            double salary = getSalary();
            int creditScore = getCreditScore();
            scanner.close();
           boolean qualified =  isUserQualify(creditScore,salary);
           notifyUser(qualified);

        }
        public static double getSalary(){
            System.out.println("What is your salary?");
            double mySalary= scanner.nextDouble();
            return mySalary;
        }

    public static int getCreditScore(){
        System.out.println("What is your creditScore?");
        int myCreditScore = scanner.nextInt();

        return myCreditScore;
    }
        public static boolean isUserQualify(int myCreditScore, double mySalary){
            if(mySalary >= requiredSalary && myCreditScore >= requiredCreditScore){
                return true;
            }else {
                return false;
            }
        }
        public static void notifyUser(boolean isQualified){
            if(isQualified) {
                System.out.println("Congratulations !! You are approved.");
            }else{
                System.out.println("Sorry!! You are declined.");
            }
        }
}
