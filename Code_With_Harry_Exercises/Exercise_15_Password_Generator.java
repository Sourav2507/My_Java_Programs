package Code_With_Harry_Exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise_15_Password_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        String ch = "QWERTYUIOPLKJHGFDSAZXCVBNM123456789qwertyuioplkjhgfdsazxcvbnm@#$%&_-!"; //0 to 68

        System.out.print("Enter length of the password you want to generate : ");
        int len = sc.nextInt();

        String password = "";

        for (int i =0;i<len;i++){
            int index = rnd.nextInt(0,68);
            password+=ch.charAt(index);
        }

        System.out.println("\nGenerated password is :  "+password);
    }
}
