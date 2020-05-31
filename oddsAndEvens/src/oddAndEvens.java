import java.util.Random;
import java.util.Scanner;
/*
Project 2: Odds or Evens
For the project you are going to program a game called "Odd and Evens". It is played b/w 2 players, in your version it
will be you verses the computer. Each player will choose either "odds" or "evens", since you are playing the computer
you will get first pick. Once you choose your side, you each choose a number of fingers to play- 0 to 5. The winner will
be determined by whether the sum of your fingers is odd or even (depending on what you choose)
Here is a clip of the game being played: https://youtu.be/4ZOLs03vILs?=1m
 */
public class oddAndEvens {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//takes user input

        playTheGame();
    }

    public static void playTheGame() {
//        these take in users inputs
        Scanner input = new Scanner(System.in);
        Scanner choose = new Scanner(System.in);

//        intro
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.println();
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which are you choosing? (O)dds or (E)vens? ");
        String pickUser = choose.next();
        System.out.println(name + " has picked odds! The computer will be evens.");
        System.out.println("---------------------------------------------------------");

        /* randomizer takes in the number of fingers the user will like to play, and uses the random generator to
        decide what the computer will play
         */
        System.out.print("How many “fingers” do you put out? ");
        int userNumber = input.nextInt();
        Random rand = new Random();
        int computerNumber = rand.nextInt(6);
        System.out.println("The computer plays number \"fingers\".");
        System.out.println("---------------------------------------------------------");

//        sum - add the 2 integers together and produces the sum
        int sum = userNumber + computerNumber;
        System.out.println(userNumber + " + " + computerNumber);

//        who wins - decide whether the final answer is even/odd & declare the winner
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven) {
            System.out.println(sum + " is ... Even.");
            if (pickUser.equals("E")) {
                System.out.println(name + " Wins!!");
            } else {
                System.out.println("The computer Wins!!");
            }
        } else {
            System.out.println(sum + " is ... Odd.");
            if (pickUser.equals("O")) {
                System.out.println(name + " Wins!!");
            } else {
                System.out.println("The computer Wins!!");
            }
        }
        System.out.println("---------------------------------------------------------");

    }
}



