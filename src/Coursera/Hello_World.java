package Coursera;

public class Hello_World {

    public  static void main(String arg[]){
        int x=5;
        double height=5.5;
        boolean isTrue=false;
       System.out.println ("Hello World");
       System.out.println("Value of height is "+ height);
        System.out.println("Value of boolean is  "+ isTrue);
        System.out.println("Value of int is "+ x);

          int daysOfTheMonths[]= {31,28,31,30,31,30,31,31,30,31,30,31};

         String nameOfMonths[] = {"January","February","March","April","May","June",
        "july","August","September","October","November","December"};

        for (int i= 0; i<12; i++){
                System.out.println( nameOfMonths[i] +" has " + daysOfTheMonths[i]+" days.");
            }
        /*
        Create a while loop that will execute the following code 12 times using a counter that starts at 1 and is incremented by 1 each time through the loop.
        Within the while loop, create a switch statement that will print out the number of days in each of the months of the year.
         Use fall through capabilities so that you only have one print statement for all of the months that contain 31 days. Do not worry about leap years.*/

        int monthCount = 1;
        while (monthCount <=12){
           switch(monthCount){
               case 1:
               case 3:
               case 5:
               case 7:
               case 8:
               case 10:
               case 12:
                   System.out.println("There are 31 days in "+ nameOfMonths[monthCount-1]);
                   break;
               case 4:
               case 6:
               case 9:
               case 11:
                   System.out.println("There are 30 days in "+ nameOfMonths[monthCount-1]);
                   break;
               case 2:
                   System.out.println("There are 28 days in "+ nameOfMonths[monthCount-1]);
                   break;
               default:
                   System.out.println("Enter a valid month ");
                   break;
           }
           monthCount++;
        }
    }


}
