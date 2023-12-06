package Shapes;

import java.util.Scanner;

public class Cylinder extends shape{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the cylinder : ");
        int r = sc.nextInt();

        System.out.println("Enter height of the cylinder : ");
        int h = sc.nextInt();

        shape cylinder = new shape();

        System.out.println("Volume of the cylinder is : "+(cylinder.ar_circle(r)*h));
    }
    
}
