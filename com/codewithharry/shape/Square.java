package com.codewithharry.shape;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rect square1 = new Rect();

        System.out.print("Enter edge length of the cube : ");
        int a = sc.nextInt();

        System.out.println("\nThus the volume of the Cube with edge length : "+a+" is : "+square1.vol_rect(a,a,a));
        System.out.println("\nThus the surface area of the Cube with edge length : "+a+" is : "+square1.sa_rect(a,a,a));

    }
}
