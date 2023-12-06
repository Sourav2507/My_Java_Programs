package Code_With_Harry_Exercises;

import java.util.Scanner;

public class Exercise_7_Straight_Line_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X-Coordinate of Initial point : ");
        int x1 = sc.nextInt();
        System.out.print("Enter Y-Coordinate of Initial point : ");
        int y1 = sc.nextInt();

        System.out.println();

        System.out.print("Enter X-Coordinate of Final point : ");
        int x2 = sc.nextInt();
        System.out.print("Enter Y-Coordinate of Final point : ");
        int y2 = sc.nextInt();

        float y = y2-y1;
        float x = x2-x1;

        System.out.println();

        float constant = x*y1 - y*x1 ;

        System.out.println("Equation of the Straight line is : ("+y+")X - ("+x+")Y + ("+constant+") = 0");
    }
}
