package chapter8;

public class BackwardPrint {
    //Print a string backward
    public static void main(String [] args){
        printBackward("Hello sunanda !");

    }
    public static void printBackward(String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
}
