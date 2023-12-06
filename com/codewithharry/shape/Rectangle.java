package com.codewithharry.shape;

import java.util.Scanner;

class Rect{

    public int vol_rect(int a,int b,int c){
        return a*b*c ;
    }

    public int sa_rect(int a,int b,int c){
        return 2*(a*b + b*c + c*a);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rect rectangle1 = new Rect();

        System.out.print("Enter Length : ");
        int l = sc.nextInt();

        System.out.print("Enter Breadth : ");
        int b = sc.nextInt();

        System.out.print("Enter Height : ");
        int h = sc.nextInt();


        System.out.println("\nThus the volume of the Rectangle with Length : "+l+" Breadth : "+b+" and Height : "+h+" is : "+rectangle1.vol_rect(l,b,h));

        System.out.println("\nThus the surface area of the Rectangle with Length : "+l+" Breadth : "+b+" and Height : "+h+" is : "+rectangle1.sa_rect(l,b,h));


    }
}
