package Code_With_Harry_Exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise_2_Rock_Paper_Scissors {
    public static void main(String[] args) {

        System.out.println("Enter \n 1 for Rock \n 2 for Paper \n 3 for Scissors ");

        for (int i =1 ;i<=3;i++) {
            Random random = new Random();
            int system_num = random.nextInt(1, 3);

            String system_input = "null";

            if (system_num == 1) {
                system_input = "Rock";
            }

            if (system_num == 2) {
                system_input = "Paper";
            }

            if (system_num == 3) {
                system_input = "Scissors";
            }

            System.out.print("Attempt : "+i+" Your Input is : ");
            Scanner sc = new Scanner(System.in);
            short user_num = sc.nextShort();

            if (user_num > 3) {
                System.out.println("Invalid Input Please Enter a Correct Input ");
                i--;
                continue;
            }

            String User_input = "null";

            if (user_num == 1) {
                User_input = "Rock";
            }

            if (user_num == 2) {
                User_input = "Paper";
            }

            if (user_num == 3) {
                User_input = "Scissors";
            }

            if (user_num == system_num) {
                System.out.println("You Choose : " + User_input + " and System Choose : " + system_input + " Result : Draw");

            } else {
                if (user_num == 1 && system_num == 2) {
                    System.out.println("You Choose : " + User_input + " and System Choose : " + system_input + " Result : You Lose !");
                } else if (user_num == 2 && system_num == 3) {
                    System.out.println("You Choose : " + User_input + " and System Choose : " + system_input + " Result : You Lose !");
                } else if (user_num == 3 && system_num == 1) {
                    System.out.println("You Choose : " + User_input + " and System Choose : " + system_input + " Result : You Lose !");
                } else {
                    System.out.println("You Choose : " + User_input + " and System Choose : " + system_input + " Result : You Win !");

                }
            }
        }
    }
}
