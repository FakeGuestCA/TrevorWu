import java.util.ArrayList;
import java.util.Scanner;

public class School {
    public static ArrayList<String> getTfirst() {
        return tfirst;
    }
    public static void setTfirst(ArrayList<String> tfirst) {
        School.tfirst = tfirst;
    }
    public static ArrayList<String> getTlast() {
        return tlast;
    }
    public static void setTlast(ArrayList<String> tlast) {
        School.tlast = tlast;
    }
    public static ArrayList<String> getTsubject() {
        return tsubject;
    }
    public static void setTsubject(ArrayList<String> tsubject) {
        School.tsubject = tsubject;
    }
    public static ArrayList<String> getSfirst() {
        return sfirst;
    }
    public static void setSfirst(ArrayList<String> sfirst) {
        School.sfirst = sfirst;
    }
    public static ArrayList<String> getSlast() {
        return slast;
    }
    public static void setSlast(ArrayList<String> slast) {
        School.slast = slast;
    }
    public static ArrayList<String> getSgrade() {
        return sgrade;
    }
    public static void setSgrade(ArrayList<String> sgrade) {
        School.sgrade = sgrade;
    }
    public static ArrayList<String> getSnum() {
        return snum;
    }
    public static void setSnum(ArrayList<String> snum) {
        School.snum = snum;
    }
    // teacher arrays //
    static ArrayList<String> tfirst = new ArrayList<String>(); // teacher first name array //
    static ArrayList<String> tlast = new ArrayList<String>(); // teacher last name array //
    static ArrayList<String> tsubject = new ArrayList<String>(); // teacher subject array //
    // student arrays //
    static ArrayList<String> sfirst = new ArrayList<String>(); // student first name array //
    static ArrayList<String> slast = new ArrayList<String>(); // student last name array //
    static ArrayList<String> sgrade = new ArrayList<String>(); // student grade array //
    static ArrayList<String> snum = new ArrayList<String>(); // student number array //

    public static void main() {
        Main myObj = new Main();
        Scanner Obj = new Scanner(System.in);
        int use = 1;
        // loop function that keeps asking the user what to do (until they decide to quit) //
        while (use == 1){
            System.out.println("What do you want to do? Type 0 to quit the program. Type 1 to do something with the teacher array. Type 2 to do something with the student array. Type 3 to print out both student and teacher arrays.");
            int choice = Obj.nextInt();
            // stop the code function when user wants to quit the program //
            if (choice == 0){
                use = 0;
                System.out.println("Goodbye.");
                break;
            }
            // handles the teacher array stuff //
            else if (choice == 1){
                System.out.println(" ");
                System.out.println("Type 0 to go back. Type 1 to add teacher. Type 2 to show all teachers. Type 3 to show a teacher in a specific index. Type 4 to remove a teacher.");
                int choicet = Obj.nextInt();
                // add teacher //
                if (choicet == 1){
                    Teacher.addteacher();
                }
                // show all teachers //
                else if (choicet == 2){
                    Teacher.showteacherall();
                }
                // show a teacher in a specific index //
                else if (choicet == 3){
                    Teacher.showteacherspecific();
                }
                // remove a teacher //
                else if (choicet == 4){
                    Teacher.removeteacher();
                }
                // go back function //
                else if (choicet == 0){
                    System.out.println(" ");
                }
                // invalid input //
                else {
                    System.out.println("Invalid input.");
                }
            }
            // handles the student array stuff //
            else if (choice == 2){
                System.out.println(" ");
                System.out.println("Type 0 to go back. Type 1 to add student. Type 2 to show all students. Type 3 to show a student in a specific index. Type 4 to remove a student.");
                int choices = Obj.nextInt();
                // add student //
                if (choices == 1){
                    Student.addstudent();
                }
                // show all students //
                else if (choices == 2){
                    Student.showstudentall();
                }
                // show a student in a specific index //
                else if (choices == 3){
                    Student.showstudentspecific();
                }
                // removes a student //
                else if (choices == 4){
                    Student.removestudent();
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
            // prints out both student and teacher lists without going into teacher or student section //
            else if (choice == 3){
                Teacher.showteacherall();
                Student.showstudentall();
            }
            else{
                System.out.println("Invalid input.");
            }
        }
    }
}
