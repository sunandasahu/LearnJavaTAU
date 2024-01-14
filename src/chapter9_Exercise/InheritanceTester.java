package chapter9_Exercise;


import java.util.Scanner;

public class InheritanceTester {
    public static void main(String [] args){
        BirthdayCake bCake = new BirthdayCake();
        System.out.println("My birthday cake is "+ bCake.getFlavor()+ " flavor. It has "+ bCake.getCandles() + " candles");
        System.out.println("My birthday cake cost $"+ bCake.getPrice());

        WeddingCake wCake = new WeddingCake();
        wCake.setFlavor("Chocolate");
        wCake.setPrice(99.99);
        System.out.println("Wedding cake is "+ wCake.getFlavor()+ " flavor. It has "+ wCake.getTiers() + " tiers.");
        System.out.println("Wedding  cake cost $"+ wCake.getPrice());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");


    }
    }



