package Code_With_Harry_Basic_Java;

import java.util.Random;
import java.util.Scanner;

public class Coin_toss_simulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        Random rd = new Random();
        while(input!=-1) {
            int outcome = rd.nextInt(1, 3);
            System.out.print("Enter input : ");
            input = sc.nextInt();
            System.out.println("Outcome is : "+outcome);
        }
    }
}
