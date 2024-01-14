package Coursera;

public class ForLoops {

    public static void main(String Arg[]){

        String daysOfWeek[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        //Way 1
        for(int i=0; i<=6; i++){

            System.out.println(daysOfWeek[i]);
        }
        //Way 2
        for(String day : daysOfWeek ){
            System.out.println(day);
        }
        //reverse print the element
        for(int i=6; i>=0; i--){

            System.out.println(daysOfWeek[i]);
        }

    }

}
