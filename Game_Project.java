// Create a class Game, which allows a user to play "Guess the Number" game once.
//    Game should have the following methods:
//    =>    Constructor to generate the random number
//    =>    takeUserInput() to take a user input of number
//    =>    isCorrectNumber() to detect whether the number entered by the user is true
//    =>    getter and setter for noOfGuesses
// Use properties such as noOfGuesses(int), etc. to get this task done!

import java.util.Random;
import java.util.Scanner;

class Game {
    int UserNum;
    int computerNum;
    public Game() {
        Random random = new Random();
        computerNum = random.nextInt(100);
//        System.out.println(computerNum);
    }
    
    public void takeUserInput() {
        System.out.print("Enter a Number between 1-100 : ");
        do {
            Scanner sc = new Scanner(System.in);
            UserNum = sc.nextInt();

            if (computerNum >= 0 && computerNum <= 10) {
                System.out.print("Your Number is Too high, Enter Again : ");
            } else if (computerNum > 10 && computerNum <= 20) {
                System.out.print("Your Number is very high, Enter Again : ");
            } else if (computerNum > 20 && computerNum <= 30) {
                System.out.print("Your Number is high, Enter Again : ");
            } else if (computerNum > 30 && computerNum <= 40) {
                System.out.print("Your Number is moderate high, Enter Again : ");
            } else if (computerNum > 40 && computerNum <= 50) {
                System.out.print("Your Number is average, Enter Again : ");
            } else if (computerNum > 50 && computerNum <= 60) {
                System.out.print("Your Number is moderate low, Enter Again : ");
            } else if (computerNum > 60 && computerNum <= 70) {
                System.out.print("Your Number is low, Enter Again : ");
            } else if (computerNum > 70 && computerNum <= 80) {
                System.out.print("Your Number is very low, Enter Again : ");
            } else if (computerNum > 80 && computerNum <= 90) {
                System.out.print("Your Number is too low, Enter Again : ");
            } else if (computerNum > 90 && computerNum <= 100) {
                System.out.print("Your Number is obviously low, Enter Again : ");
            }
        }while (UserNum != computerNum);
    }

    public void isCorrectNumber() {
        if (computerNum == UserNum) {
            System.out.println("\nNumbers are Match.");
        }
        else {
            System.out.println("\nNumbers are not Match.");
        }
    }

    public int getComputerNum() {
        return computerNum;
    }
}

public class Game_Project {
    public static void main(String[] args) {
        Game obj1 = new Game();

        obj1.takeUserInput();
        obj1.isCorrectNumber();

        System.out.println("The Number of Computer = " + obj1.getComputerNum());
    }
}