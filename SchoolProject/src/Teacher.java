import java.util.Scanner;

public class Teacher {

    // add teacher to array //
    public static void addteacher() {
        Scanner myObj = new Scanner(System.in);
        // insert teacher first name //
        System.out.println("What is the first name of the teacher that you would like to add?");
        String first = myObj.nextLine();
        School.tfirst.add(first);
        // insert teacher last name //
        System.out.println("What is the last name of the teacher that you would like to add?");
        String last = myObj.nextLine();
        School.tlast.add(last);
        // insert teacher subject //
        System.out.println("What is the subject of the teacher that you would like to add?");
        String sub = myObj.nextLine();
        School.tsubject.add(sub);
        // prints out the thing inserted into list //
        System.out.println("Teacher inserted into the list is: "+first+" "+last+", subject that they teach is "+sub);
        System.out.println(" ");
    }

    // show the entire array of teachers //
    public static void showteacherall(){
        if (School.tfirst.isEmpty()){
            System.out.println("The teacher array is empty. There is nothing to show.");
            System.out.println(" ");
        }else{
            System.out.println("The teachers in the list are:");
            for( int i = 0; i < School.tlast.size(); i++){
                System.out.println("Teacher is: "+School.tfirst.get(i)+" "+School.tlast.get(i)+", and the subject that they teach is "+School.tsubject.get(i));
            }
            System.out.println(" ");
        }
    }

    // show the exact teacher in the array //
    public static void showteacherspecific(){
        Scanner myObj = new Scanner(System.in);
        if (School.tfirst.isEmpty()){
            System.out.println("The teacher array is empty. There is nothing to show.");
            System.out.println(" ");
        }else{
            System.out.println("Which index in the teacher array do you want to see?");
            int i = myObj.nextInt();
            if (i > School.tfirst.size()){
                System.out.println("Invalid input. Nothing is in the index that you chose.");
                System.out.println(" ");
            }else{
                System.out.println("Teacher in the index that you have chosen is: " + School.tfirst.get(i) + " " + School.tlast.get(i) + ", and the subject they teach is " + School.tsubject.get(i));
                System.out.println(" ");
            }
        }
    }

    // remove a teacher from array //
    public static void removeteacher(){
        Scanner myObj = new Scanner(System.in);
        showteacherall();
        // check if the array is empty or not //
        if (School.tfirst.isEmpty()){
            System.out.println("There is nothing to remove.");
            System.out.println(" ");
        }else{
            // allows user to remove a teacher from array if it is not empty //
            System.out.println("Which index is the teacher in that you would like to remove?");
            int i = myObj.nextInt();
            if (i > School.tfirst.size()){
                System.out.println("Invalid input. Nothing is in the index that you chose.");
                System.out.println(" ");
            }else{
                School.tfirst.remove(i);
                School.tlast.remove(i);
                School.tsubject.remove(i);
                System.out.println("Teacher in the index "+i+" has been successfully removed.");
                System.out.println(" ");
            }
        }
    }
}
