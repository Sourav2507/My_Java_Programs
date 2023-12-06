package Code_With_Harry_Practice_Problems;

import java.util.Random;
import java.util.Scanner;

class Cylinder{
    private float radius;
    private float height;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }

    public float getSA(){
        return (float) ((2*Math.PI*radius*height)+(Math.PI*radius*radius*2));
    }

    public float getVolume(){
        return (float)(Math.PI*radius*radius*height);
    }
}


class Rectangle{

    private float length;
    private float breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float getLength() {
        return length;
    }

    public float getBreadth() {
        return breadth;
    }
}

class Sphere{
    private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public float SA(){
        return (float)(4*Math.PI*radius*radius);
    }
}

public class Chapter_9_Practice_Set {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*System.out.print("Enter the height of the Cylinder : ");
        float h = sc.nextFloat();

        System.out.print("Enter the radius of the Cylinder : ");
        float r = sc.nextFloat();

        Cylinder c1 = new Cylinder(r,h);

        System.out.println("Thus the Radius is : "+c1.getRadius());
        System.out.println("Thus the Height is : "+c1.getHeight());

        System.out.println("Thus the Surface Area of the cylinder is : "+c1.getSA());
        System.out.println("Thus the Volume of the cylinder is : "+c1.getVolume());*/


        /*Rectangle r1 = new Rectangle();
        System.out.println("Current Reactangle has length : "+r1.getLength()+" and breadth : "+r1.getBreadth());*/

        /*System.out.print("Enter Custom Length for the Rectangle : ");
        float l = sc.nextFloat();

        System.out.print("Enter Custom Breadth for the Rectangle : ");
        float b = sc.nextFloat();*/

        /*Rectangle r = new Rectangle(12,56);

        System.out.println(r.getLength());
        System.out.println(r.getBreadth());*/

        Sphere s = new Sphere();

        System.out.print("Enter radius of the Sphere : ");
        float r = sc.nextFloat();

        s.setRadius(r);
        System.out.println("Thus the radius is : "+s.getRadius()+" and the total Surface Area is : "+s.SA());

    }
}
