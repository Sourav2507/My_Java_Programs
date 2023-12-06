package com.codewithharry.shape;

import java.util.Scanner;

class cir{
public float area_circle (int r){

    return (float)(Math.PI*r*r);

    }

public float area_sphere (int r){

    return (float)(4*Math.PI*r*r);

    }

    public float vol_sphere(int r){

    return (float) (4/3f*(Math.PI*r*r*r));

    }
}

public class Circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        cir circle1 = new cir();

        System.out.print("Enter radius of the circle : ");
        int r = sc.nextInt();

        System.out.println("Area of the Circle with radius "+r+" is "+circle1.area_circle(r));
    }
}
