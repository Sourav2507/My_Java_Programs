package Shapes;

import java.util.Scanner;

public class Sphere extends shape {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter radius of the Sphere : ");
     int r = sc.nextInt();

     shape sphere = new shape();
     System.out.println("Surfce area of the sphere is "+(sphere.ar_circle(r)*4));

     System.out.println("Volume of the sphere is "+(sphere.ar_circle(r)*(4/3)));

    }
}
