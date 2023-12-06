package com.codewithharry.shape;

import java.util.Scanner;

class Cyl{

    cir cylinder1 = new cir();

    public float cyl_volume (int r,int h){
        return (float) (cylinder1.area_circle(r)*h);
    }

    public float cyl_sa(int r,int h){
        return (float)(2*cylinder1.area_circle(r)+2*Math.PI*r*h);
    }

}

public class Cylinder {
    public static void main(String[] args) {

        Cyl cylinder2 = new Cyl();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the Cylinder : ");
        int r = sc.nextInt();

        System.out.print("Enter height of the cylinder : ");
        int h = sc.nextInt();

        System.out.println("\nThus the volume of the cylinder with radius : "+r+" and height : "+h+" is : "+cylinder2.cyl_volume(r,h));

        System.out.println("\nThus the Surface area of the Cylinder with radius : "+r+" and height : "+h+" is : "+cylinder2.cyl_sa(r,h));

    }
}
