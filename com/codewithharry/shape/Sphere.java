package com.codewithharry.shape;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        cir sphere1 = new cir();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the Sphere : ");
        int r = sc.nextInt();

        System.out.println("\nVolume of the sphere with radius : "+r+" is : "+sphere1.vol_sphere(r));
        System.out.println("\nSurface Area of the sphere with radius : "+r+" is : "+sphere1.area_sphere(r));

    }
}
