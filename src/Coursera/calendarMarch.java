package Coursera;

import java.net.StandardSocketOptions;

public class calendarMarch {

    public static void main(String arg []) {

        String days = "  S   M   T   W   T   F   S";
        int beginningPlace = 5;
        int totalNumberOfDays = 31;
        String monthName = "MARCH";
        System.out.println("           "+monthName);
        System.out.print(days);
        int day =1;

        for (int i=1; i<beginningPlace+totalNumberOfDays; i++){
            if(i % 7 == 1 ){
                System.out.println();
            }
            if(i < beginningPlace){
                System.out.print("    ");
            }else{
                if(day/10 == 0){
                    System.out.print("   "+day);
                }else {
                    System.out.print("  " + day);
                }
                day++;
            }
        }

    }
}
