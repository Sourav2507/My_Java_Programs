package Code_With_Harry_Practice_Problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Chapter_2_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        float num_1 = sc.nextFloat();
        System.out.println();

        System.out.print("Enter the second number : ");
        float num_2 = sc.nextFloat();
        System.out.println();

        if (num_1>num_2){
            System.out.println(num_1+" is Greater than "+num_2);
        } else if (num_2>num_1) {
            System.out.println(num_2+" is Greater than "+num_1);
        }
        else {
            System.out.println("Both the numbers are equal ");
        }
    }
}
