package Shapes;

import java.util.Scanner;

public class Rectangle extends shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        shape rectangle = new shape();

        System.out.print("Enter length of the Rectangle : ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of the Rectangle : ");
        int b = sc.nextInt();

        System.out.println("Area of the rectangle is : "+rectangle.ar_rect(l,b));

    }
}
