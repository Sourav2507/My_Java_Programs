package Shapes;

import java.util.Scanner;

public class Square extends shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        shape square = new shape();

        System.out.print("Enter length of the square : ");
        int l = sc.nextInt();

        System.out.println("Area of the Square is "+square.ar_square(l));
    }
    
}
