import java.util.Scanner;
import java.util.Random;
public class main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        Random rand = new Random();
        int win = 0;
        int lose = 0;
        System.out.println("Do you want to play rock paper scissors? 1 = yes, 0 = no."); //ask player if they want to play//
        int play = myObj.nextInt();
        if (play == 1 || play == 0){

            while (play == 1) {
                System.out.println(win+" games won");
                System.out.println(lose+" games lost");
                int com = rand.nextInt(3); // random number generator from 0 to 2
                //rock = 0
                //paper = 1
                //scissors = 2
                System.out.println("What do you choose? 0 = rock, 1 = paper, 2 = scissors");
                int user = myObj.nextInt(); // reads user input //
                if (user < 0 || user > 2){
                    System.out.println("Invalid input.");
                    break;
                }else{
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


                // if computer chose rock
                else if (com == 0) {
                    if (user == 1) {
                        System.out.println("Paper beats rock and you chose paper. You win!");
                        win = win + 1; // adds 1 win //
                    } else {
                        System.out.println("Rock beats scissors and you chose scissors. You lose!");
                        lose = lose + 1; // adds 1 lose//
                    }
                    //computer paper.
                } else if (com == 1) {
                    if (user == 0) {
                        System.out.println("Paper beats rock and you chose rock. You lose!");
                        lose = lose + 1;
                    } else {
                        System.out.println("Scissors beats paper and you chose scissors. You win!");
                        win = win + 1;

                    }
                    // computer scissors.
                } else if (user == 0) {
                    System.out.println("Rock beats scissors and you chose rock. You win!");
                    win = win + 1;
                } else {
                    System.out.println("Scissors beats paper and you chose paper. You lose!");
                    lose = lose + 1;
                }
                    System.out.println("********************************************************");
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
