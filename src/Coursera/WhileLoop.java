package Coursera;

public class WhileLoop {

    public static void main(String Arg[]){
        //while loop that will print out only even numbers between 1 and 20

//        int count = 0;
//        while(count <=20){
//            count++;
//            if((count % 2)==1){
//               continue;
//            }
//            System.out.print(count+ ", ");
//        }
//
//        for(int i=1; i<=20; i++){
//           if(i % 2 == 0){
//               if(1==18)
//               System.out.print(i + ", ");
//           }
//        }

        //Create a for loop that will print out all numbers between 1 and 100 except 50 thru 60.
        for(int i=1; i<=100; i++){
            if(i>49 && i<61){
                    continue;
            }
                    System.out.println(i + ", ");
            }
        }




}
