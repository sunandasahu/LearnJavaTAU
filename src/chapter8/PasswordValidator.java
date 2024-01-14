package chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    /*
    at least 8 characters
    contain an uppercase letter
    contains a special character
    not contain the username
    not the same as the old password
     */

    static String userName ="Sunanda";
    static String oldPassword = "MyOldPassword";
    static String newPassword = "ilove@family";

    public static void main(String []args){
        validatePassword(newPassword);

    }
    public static void validatePassword(String password){
       if (password.length()<8){
           System.out.println("Your password should be at least 8 characters.");
        }
       if (password  == oldPassword) {
            System.out.println("Your password can not be equal to old password.");
        }
        if (password  == userName) {
            System.out.println("Your password can not be same as username.");
        }

        if(password.equals(password.toLowerCase())){
          System.out.println("Your password must include an uppercase letter.");
        }

        Pattern p = Pattern.compile(
                "[^A-Za-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        boolean res = m.find();
        if (!res){
            System.out.println("Your password should contain at least one special character.");
        }

    }

}
