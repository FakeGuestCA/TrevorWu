import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {

        // ADDING A INT TO THE END OF AN ARRAY //
        int[] num = {1,2,3,4};
        System.out.println("Original array:"+Arrays.toString(num)); // print out original array //
        // copying the array //
        int[] newadd = new int [5];
        int a = 0;
        for(a = 0; a < num.length; a++){
            newadd[a] = num[a];
        }
        // Assign 5 to the last element //
        newadd[newadd.length-1] = 5;
        // print out edited array //
        System.out.println("Added 5 to end of array:"+Arrays.toString(newadd));



        // SUBTRACTING LAST ELEMENT FROM ARRAY //
        int[] newsub = new int [4];
        a = 0;
        for(a = 0; a < num.length; a++){
            newsub[a] = num[a];
        }
        System.out.println("Deleted last number from array:"+Arrays.toString(newsub));



        // Assigning numbers into an array at chosen index //
        Scanner myObj = new Scanner(System.in);
        System.out.println("What number do you want to insert?");
        int x = myObj.nextInt();
        System.out.println("Which index in the array do you want to insert?");
        int y = myObj.nextInt();
        // copying the array //
        int[] assignnum = new int [5];
        a = 0;
        for(a = 0; a < num.length; a++){
            assignnum[a] = num[a];
        }
        // Assign 5 to the last element //
        assignnum[assignnum.length-1] = 5;
        // Assign num to the index element //
        assignnum[y-1] = x;
        // print out edited array //
        System.out.println("Edited array:"+ Arrays.toString(assignnum));
    }
}
