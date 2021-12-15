import java.util.Random;
import java.util.Scanner;

public class main {
    static int hour;
    static int minute;
    static int second;

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        Random rand = new Random();
        int use = 1;
        // set the time to random //
        hour = rand.nextInt(24);
        minute = rand.nextInt(60);
        second = rand.nextInt(60);
        // loop function that keeps asking the user what to do (until they decide to quit) //
        while (use == 1){
            System.out.println("What do you want to do? Type 0 to quit the program. Type 1 to see time. Type 2 to set time. Type 3 to put it into a string.");
            int choice = myObj.nextInt();
            // stop the loop function when user requests to quit the program //
            if (choice == 0){
                use = 0;
                System.out.println("Goodbye.");
                break;
            }
            // handles the see time stuff //
            else if (choice == 1){
                System.out.println(" ");
                System.out.println("Type 0 to go back. Type 1 to get hour. Type 2 to get minute. Type 3 to get second. Type 4 to show all three.");
                int choiceg = myObj.nextInt();
                // get hour //
                if (choiceg == 1){
                    getHour();
                }
                // get minute //
                else if (choiceg == 2){
                    getMinute();
                }
                // get second //
                else if (choiceg == 3){
                    getSecond();
                }
                // get time //
                else if (choiceg == 4){
                    getTime();
                }
                // go back function //
                else if (choiceg == 0){
                    System.out.println(" ");
                }
                // invalid input //
                else {
                    System.out.println("Invalid input.");
                }
            }
            // handles the set time stuff //
            else if (choice == 2){
                System.out.println(" ");
                System.out.println("Type 0 to go back. Type 1 set hour. Type 2 to set minute. Type 3 to set second. Type 4 to set all three together. Type 5 to advance it by a second. Type 6 to go back by a second.");
                int choices = myObj.nextInt();
                // set hour //
                if (choices == 1){
                    setHour();
                }
                // set minute //
                else if (choices == 2){
                    setMinute();
                }
                // set second //
                else if (choices == 3){
                    setSecond();
                }
                // set hour, minute, and second in one go //
                else if (choices == 4){
                    setTime();
                }
                // advance time by a second //
                else if (choices == 5){
                    nextSecond();
                }
                // go back time by a second //
                else if (choices == 6){
                    previousSecond();
                }
                // go back function //
                else if (choices == 0){
                    System.out.println(" ");
                }
                // invalid input //
                else {
                    System.out.println("Invalid input.");
                }
            }
            // putting the time into a string //
            else if (choice == 3){
                intoString();
            }
            else{
                System.out.println("Invalid input.");
            }
        }
    }

    public static void getHour(){
        System.out.println(" ");
        System.out.println("The hour is "+hour+"h");
    }
    public static void getMinute(){
        System.out.println(" ");
        System.out.println("The minute is "+minute+"m");
    }
    public static void getSecond(){
        System.out.println(" ");
        System.out.println("The second is "+second+"s");
    }
    public static void getTime(){
        System.out.println(" ");
        System.out.println("Current time is "+hour+":"+minute+":"+second);
    }

    public static void setHour(){
        Scanner myObj = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("What is the hour that you would like to set to?");
        int h = myObj.nextInt();
        hour = h;
        System.out.println("The time has been updated.");
        getTime();
    }
    public static void setMinute(){
        Scanner myObj = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("What is the minute that you would like to set to?");
        int m = myObj.nextInt();
        minute = m;
        System.out.println("The time has been updated.");
        getTime();
    }
    public static void setSecond(){
        Scanner myObj = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("What is the second that you would like to set to?");
        int s = myObj.nextInt();
        second = s;
        System.out.println("The time has been updated.");
        getTime();
    }
    public static void setTime(){
        setHour();
        setMinute();
        setSecond();
    }

    public static String intoString(){
        String time = "";
        String h = "";
        String m = "";
        String s = "";
        if (hour < 10){
            h = "0"+hour;
        }else{
            h = h+hour;
        }
        if (minute < 10){
            m = "0"+minute;
        }else{
            m = m+minute;
        }
        if (second < 10){
            s = "0"+second;
        }else{
            s = s+second;
        }
        time = time+h+":"+m+":"+s;
        System.out.println(time);
        return time;
    }
    public static void nextSecond(){
        if (second > 58){
            second = 0;
            if (minute > 58){
                minute = 0;
                if(hour > 22){
                    hour = 0;
                }else{
                    hour++;
                }
            }else{
                minute++;
            }
        }else{
            second++;
        }
        getTime();
    }
    public static void previousSecond(){
        if (second < 1){
            second = 59;
            if (minute < 1){
                minute = 59;
                if (hour < 1){
                    hour = 23;
                }else{
                    hour--;
                }
            }else{
                minute--;
            }
        }else{
            second--;
        }
        getTime();
    }
}
