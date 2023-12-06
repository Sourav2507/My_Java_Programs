package Code_With_Harry_Practice_Problems;

import java.util.Scanner;

class circle2 {

    public int radius;

    public circle2(int radius) {
        this.radius = radius;
    }

    public float area (){
        return (float)(Math.PI*this.radius*this.radius);
    }

}

class cylinder2 extends circle2 {

    public int height ;

    public cylinder2(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public float volume (){
        return (float) (Math.PI*this.radius*this.radius*this.height);
    }
}

class  rectangle2 {

    public int length;
    public int breadth;

    public rectangle2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area (){
        return this.length*this.breadth;
    }
}

class cuboid2 extends rectangle2 {

    public int height;

    public cuboid2(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public int volume(){
        return this.length*this.breadth*this.height;
    }
}
public class Chapter_10_Practice_Set {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        cylinder2 obj1 = new cylinder2(2,3);

        System.out.println("Area of the Circle is : "+obj1.area());
        System.out.println("Volume of the Cylinder is : "+obj1.volume());

        cuboid2 obj2 =new cuboid2(2,3,4);

        System.out.println("Area of the Rectangle is : "+obj2.area());
        System.out.println("Volume of the Cuboid is : "+obj2.volume());
    }
}
