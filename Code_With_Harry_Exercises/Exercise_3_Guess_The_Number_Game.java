package Code_With_Harry_Exercises;


import java.util.Random;
import java.util.Scanner;

class Game {

    static void verify (int n,int x){
        System.out.println();
        if (n==x){
            System.out.println("Hurray !! You guessed the correct Number \n Your Input : "+n);
        }
        if (n>x){
            System.out.println("Try a smaller Number !!");
        }
        if (n<x){
            System.out.println("Try a larger Number !!");
        }
    }
    public void start(){

        Scanner sc1 = new Scanner(System.in);
        Random rnd = new Random();

        int attempts = 5;

        int sysno = rnd.nextInt(1,10);

        for (int i = 1;i<=5;i++) {

            System.out.print("\nGuess A number between 1 to 10 : ");
            int inp = sc1.nextInt();

            verify(inp, sysno);

            System.out.println();

            if (inp==sysno){
                attempts = i;
                break;
            }
        }
        System.out.println("Attempts Taken : "+attempts);
    }
}

public class Exercise_3_Guess_The_Number_Game {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        Game guessNo =new Game();

        guessNo.start();
    }
}