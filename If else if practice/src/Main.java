import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int people = 30;
        int cars = 40;
        int buses = 15;


        if ( cars > people )
        {
            // If the value of cars is bigger than the value of people, it would print out the line below.
            // If the statement is false, then it would not print out the line below and instead go to the next line of code.
            System.out.println( "We should take the cars." );
        }
        else if ( cars < people )
        {

            // Will only print out line below if statement above was false and the value of cars is bigger than value of
            // people.
            System.out.println( "We should not take the cars." );
        }
        else
        {
            // If neither of the statement above are true, then it will print out the line below.
            System.out.println( "We can't decide." );
        }


        if ( buses > cars )
        {
            // if the value of buses is bigger than the value of cars, it will print out the line below.
            System.out.println( "That's too many buses." );
        }
        else if ( buses < cars )
        {
            // Will print out line below if both the statement above is false and the value of buses is bigger than value of
            // cars.
            System.out.println( "Maybe we could take the buses." );
        }
        else
        {
            // Will print out line below if both statements above are false.
            System.out.println( "We still can't decide." );
        }


        if ( people > buses )
        {
            // Will print out line below if the value of people is bigger than the value of buses.
            System.out.println( "All right, let's just take the buses." );
        }
        else
        {
            // If statement above is false, then it will print out this line.
            System.out.println( "Fine, let's stay home then." );
        }

        // ANSWERS //
        // 1. Else if is used when both the statement above is false. Else is only used when the statement above is false.
        // 2. If both the statements are true, it would print out both of the lines.








        // AGE PRACTICE //
        System.out.println("Enter age");

        int age = myObj.nextInt();  // Read user input


        if ( age < 16){
            System.out.println("You can't drive.");
        }
        else if ( age > 15 && age < 18){
            System.out.println("You can drive but not vote.");
        }
        else if ( age > 17 && age < 25){
            System.out.println("You can vote but not rent a car.");
        }
        else{
            System.out.println("You can do pretty much anything.");
        }






        // SPACE BOX //

        System.out.println("Enter Earth weight:");
        int ew = myObj.nextInt();  // Read user input
        System.out.println("Enter which planet are you going to? (1 = Venus, 2 = Mars, 3 = Jupiter, 4 = Saturn, 5 = Uranus, 6 = Neptune)");
        int planet = myObj.nextInt();  // Read user input2

        // 1 = Venus, 2 = Mars, 3 = Jupiter, 4 = Saturn, 5 = Uranus, 6 = Neptune//
        if ( planet == 1){
            System.out.println("Your weight on Venus would be "+ (ew*0.78)+ " pounds on that planet.");
        }
        else if (planet == 2){
            System.out.println("Your weight on Mars would be "+ (ew*0.39)+ " pounds on that planet.");
        }
        else if (planet == 3){
            System.out.println("Your weight on Jupiter would be "+ (ew*2.65)+ " pounds on that planet.");
        }
        else if (planet == 4){
            System.out.println("Your weight on Saturn would be "+ (ew*1.17)+ " pounds on that planet.");
        }
        else if (planet == 5){
            System.out.println("Your weight on Uranus would be "+ (ew*1.05)+ " pounds on that planet.");
        }
        else if (planet == 6){
            System.out.println("Your weight on Neptune would be "+ (ew*1.23)+ " pounds on that planet.");
        }
        else{
            System.out.println("Please input a number from 1 to 6.");
        }




        // QUIZ //
        System.out.println("Are you ready for the quiz? (Y or N)");
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int a1 = 1;
        int a2 = 3;
        int a3 = 2;

        System.out.println("Q1) What is 1+1 equal to?");
        System.out.println("    1) 2");
        System.out.println("    2) 1");
        System.out.println("    3) 11");
        int q1 = myObj.nextInt();
        if (q1 == a1) {
            System.out.println("You are correct.");
            score1 = 1;
        } else {
            System.out.println("You are incorrect. The answer should be 1).");
        }

        System.out.println("Q2) What is 9+10 equal to?");
        System.out.println("    1) 21");
        System.out.println("    2) 16");
        System.out.println("    3) 19");
        int q2 = myObj.nextInt();
        if (q2 == a2) {
            System.out.println("You are correct.");
            score2 = 1;
        } else {
            System.out.println("You are incorrect. The answer should be 3).");
        }

        System.out.println("Q3) In the equation 3x+3=6*9/2 What is x equal to?");
        System.out.println("    1) 21");
        System.out.println("    2) 8");
        System.out.println("    3) 3.1415926");
        int q3 = myObj.nextInt();
        if (q3 == a3) {
            System.out.println("You are correct.");
            score3 = 1;
        } else {
            System.out.println("You are incorrect. The answer should be 2).");
        }
        int scoretot = score1+score2+score3;

        if (scoretot == 0){
            System.out.println("You have answered 0 questions correctly, you execution date is tomorrow at 8:00 A.M.");
        } else {
            System.out.println("You have answered "+scoretot+" out of 3 question correctly.");
        }
    }
}