import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String args[]){

        // ASSIGNMENT 1 //
        int[] num = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int a = 0;
        int times = 0;
        while (times < 20){
            num[a] = (int)Math.floor(Math.random()*(6-1+1)+1);
            a++;
            times++;
        }



        // Prints out entire list //
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        // checks how many 1s are there in the list //
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1){
                count = count +1;
            }
        }
        System.out.println("There are "+count+" ones in the array.");



        //***********************************************************************//
        // ASSIGNMENT 2 //
        int[] num2 = {0,1,2,3,4,5,6,7,8,9};
        int a2 = 0;
        int times2 = 0;
        while (times2 < 10){
            num2[a2] = (int)Math.floor(Math.random()*(100-1+1)+1);
            a2++;
            times2++;
        }
        times2 = 0;
        a2 = 0;
        // prints out entire array //
        for (int i = 0; i < num2.length; i++){
            System.out.println(num2[i]);
        }
        double sum = num2[0]+num2[1]+num2[2]+num2[3]+num2[4]+num2[5]+num2[6]+num2[7]+num2[8]+num2[9];
        double tot = sum/10;
        System.out.println("The total is "+tot);



        // swapping the first and second int in the array //
        int n1 = num2[0];
        num2[0] = num2[1];
        num2[1] = n1;
        // prints out entire array //
        System.out.println("Swapping the first and second int in the array.");
        for (int i = 0; i < num2.length; i++){
            System.out.println(num2[i]);
        }
        System.out.println("Swapping the first and second int in the array.");



        // reversing the entire array //
        System.out.println("Reversing the entire array.");
        int s1 = num2[0];
        int s2 = num2[1];
        int s3 = num2[2];
        int s4 = num2[3];
        int s5 = num2[4];
        num2[0] = num2[9];
        num2[1] = num2[8];
        num2[2] = num2[7];
        num2[3] = num2[6];
        num2[4] = num2[5];
        num2[5] = s5;
        num2[6] = s4;
        num2[7] = s3;
        num2[8] = s2;
        num2[9] = s1;
        // prints out entire array //
        for (int i = 0; i < num2.length; i++){
            System.out.println(num2[i]);
        }
        System.out.println("Reversing the entire array.");
    }
}
