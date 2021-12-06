import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        //TODO

        int a = 0;
        int v = 0;
        for(a = 0; a < s.length(); a++){
            if (s.charAt(a) == 'a' || s.charAt(a) == 'e' || s.charAt(a) == 'i' || s.charAt(a) == 'o' || s.charAt(a) == 'u'){
                v++;
            }
        }
        System.out.println("Total number of vowels: "+v);
        return v;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        //TODO
        int numbob = 0;
        int i = 0;
        int fromindex = 0;
        String find = "bob";
        while ((fromindex = s.indexOf(find, fromindex)) != -1){
            numbob++;
            fromindex++;
        }
        System.out.println("Total number of bob(s): "+numbob);
        return numbob;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        //TODO
        String sub = " ";
        String currentString = "";
        String longString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>=sub.charAt(0)) {
                currentString += s.charAt(i);
                if (currentString.length() > longString.length()) {
                    longString = currentString;
                }
            }
            else {
                currentString = Character.toString(s.charAt(i));
            }
            sub = Character.toString(s.charAt(i));
        }
        return longString;

    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
    }
}
