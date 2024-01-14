package chapter6;

public class MethodOverloading2 {
    public static void main(String[]args) {

        String monthName = MethodOverloading1.getMonth(6);
        System.out.println("The name of the month is :"+monthName);

        int monthNumber = MethodOverloading1.getMonth("August");
        System.out.println("The number of the month is :"+monthNumber);

    }
}
