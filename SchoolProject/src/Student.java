import java.util.Scanner;
import java.util.Random;
public class Student {

    // add a student into the array //
    public static void addstudent() {
        Scanner myObj = new Scanner(System.in);
        Random rand = new Random();
        // insert student first name //
        System.out.println("What is the first name of the student that you would like to add?");
        String first = myObj.nextLine();
        School.sfirst.add(first);
        // insert student last name //
        System.out.println("What is the last name of the student that you would like to add?");
        String last = myObj.nextLine();
        School.slast.add(last);
        // insert student grade //
        System.out.println("What is the grade of the student that you would like to add?");
        String grade = myObj.nextLine();
        School.sgrade.add(grade);
        // randomly generated student number //
        int num = rand.nextInt(696969);
        System.out.println("Their student number is "+num);
        School.snum.add(String.valueOf(num));

        // prints out the thing inserted into list //
        System.out.println("Student inserted into the student list is: "+first+" "+last+", the grade they are in is "+grade+", and their student number is "+num);
        System.out.println(" ");
    }

    // show the entire student array //
    public static void showstudentall(){
        if (School.sfirst.isEmpty()){
            System.out.println("The student array is empty. There is nothing to show.");
            System.out.println(" ");
        }else{
            System.out.println("The students in the array are:");
            for( int i = 0; i < School.sfirst.size(); i++){
                System.out.println("Student is: "+School.sfirst.get(i)+" "+School.slast.get(i)+", they are in grade "+School.sgrade.get(i)+", and their student number is "+School.snum.get(i));
            }
            System.out.println(" ");
        }
    }

    // show a specific student in the array //
    public static void showstudentspecific(){
        Scanner myObj = new Scanner(System.in);
        if (School.sfirst.isEmpty()){
            System.out.println("The student array is empty. There is nothing to show.");
            System.out.println(" ");
        }else{
            System.out.println("Which index in the student array do you want to see?");
            int i = myObj.nextInt();
            if (i > School.sfirst.size()){
                System.out.println("Invalid input. Nothing is in the index that you chose.");
                System.out.println(" ");
            }else{
                System.out.println("Student in the index that you have chosen is: " + School.sfirst.get(i) + " " + School.slast.get(i) + ", they are in grade " + School.sgrade.get(i)+", and their student number is "+School.snum.get(i));
                System.out.println(" ");
            }
        }
    }

    // removes a student //
    public static void removestudent(){
        Scanner myObj = new Scanner(System.in);
        showstudentall();
        if (School.sfirst.isEmpty()){
            System.out.println("There is nothing to remove.");
            System.out.println(" ");
        }else{
            System.out.println("Which index is the student in that you would like to remove?");
            int i = myObj.nextInt();
            if (i > School.sfirst.size()){
                System.out.println("Invalid input. Nothing is in the index that you chose.");
                System.out.println(" ");
            }else{
                School.sfirst.remove(i);
                School.slast.remove(i);
                School.sgrade.remove(i);
                School.snum.remove(i);
                System.out.println("Student in the index "+i+" has been successfully removed.");
                System.out.println(" ");
            }
        }
    }
}
