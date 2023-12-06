package Shapes;

import java.util.Scanner;

public class Circle extends shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle : ");
        int r = sc.nextInt();

        shape circle = new shape();
        System.out.println("Area of the circle is "+circle.ar_circle(r));
    }
}
