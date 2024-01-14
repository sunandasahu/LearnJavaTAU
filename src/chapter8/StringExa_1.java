package chapter8;

public class StringExa_1 {
    /*
    Count the number of words in a string
    Print the words in separate line
     */
    static String str = "I love Test Automation University !.";
    public static void main(String [] args){
        countWords(str);

    }
    /*
    splits a string into an array by tokenizing it.
    counts word and print them
    @param text full string to be split.
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("The string contains %d words", numberOfWords);
        System.out.println(message);

        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }


    }
}
