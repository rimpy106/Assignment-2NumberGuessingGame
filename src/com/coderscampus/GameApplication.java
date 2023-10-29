package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class GameApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        System.out.println("randomNum: " + randomNum);
        int guessNum = inputNum(sc, "Please guess number between 1-100");

        boolean gameWon = false;
        int i = 0;
        while (i < 5) {
            if (guessNum < 0 && guessNum > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again");
            } else {
                if (guessNum == randomNum) {
                    System.out.println("You win!");
                    gameWon = true;
                    break;
                } else if (guessNum > randomNum)
                    guessNum = inputNum(sc, "Please pick a lower number");
                else
                    guessNum = inputNum(sc, "Please pick a higher number");
            }
            i++;
        }
        if (!gameWon) {
            System.out.println("You lose, the number to guess was theRandomNumber" + randomNum);
        }
    }

    public static int inputNum(Scanner sc, String displayMsg) {
        System.out.println(displayMsg);
        int inputNum = sc.nextInt();
        return inputNum;
    }
}