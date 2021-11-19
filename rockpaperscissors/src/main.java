import java.util.Scanner;
import java.util.Random;
public class main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Do you want to play rock paper scissors? 1 = yes, 0 = no.");
        int play = myObj.nextInt();
        if (play == 1 || play == 0){

            while (play == 1) {
                int com = rand.nextInt(3); // random number generator from 0 to 2
                System.out.println(com);
                //rock = 0
                //paper = 1
                //scissors = 2
                System.out.println("What do you choose? 0 = rock, 1 = paper, 2 = scissors");
                int user = myObj.nextInt(); // reads user input //
                if (user != 0 || user != 1 || user != 2){
                    System.out.println("Invalid input.");
                    break;
                }else if (user == 0 || user == 1 || user == 2) {
                    // printing out user choice
                if (user == 0) {
                    System.out.println("You chose rock.");
                } else if (user == 1) {
                    System.out.println("You chose paper.");
                } else {
                    System.out.println("You chose scissors.");
                }
                // printing out computer choice
                if (com == 0) {
                    System.out.println("The computer chose rock.");
                } else if (com == 1) {
                    System.out.println("The computer chose paper.");
                } else {
                    System.out.println("The computer chose scissors.");
                }


                // tie system //
                if (com == user) {
                    System.out.println("It is a tie.");
                }


                //computer rock
                else if (com == 0) {
                    if (user == 1) {
                        System.out.println("Paper beats rock and you chose paper. You win!");
                    } else {
                        System.out.println("Rock beats scissors and you chose scissors. You lose!");
                    }
                    //computer paper.
                } else if (com == 1) {
                    if (user == 0) {
                        System.out.println("Paper beats rock and you chose rock. You lose!");
                    } else {
                        System.out.println("Scissors beats paper and you chose scissors. You win!");
                    }
                    // computer scissors.
                } else if (user == 0) {
                    System.out.println("Rock beats scissors and you chose rock. You win!");
                } else {
                    System.out.println("Scissors beats paper and you chose paper. You lose!");
                }
                System.out.println("Do you want to play rock paper scissors? 1 = yes, 0 = no.");
                play = myObj.nextInt();
            }
        }
        }
        else{
            System.out.println("Invalid input.");
        }
        }
        }
