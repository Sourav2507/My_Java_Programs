package Shapes;

import java.util.Scanner;

public class Cuboid extends shape {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter length of the cuboid : ");
     int l = sc.nextInt();
     
     
     System.out.print("Enter breadth of the cuboid : ");
     int b = sc.nextInt();
     
     System.out.print("Enter height of the cuboid : ");
     int h = sc.nextInt();

     shape cuboid = new shape();

     System.out.println("Volume of the Cuboid is : "+(cuboid.ar_rect(l, b)*h));

    }
}
