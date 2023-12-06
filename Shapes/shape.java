package Shapes;

public class shape{
    public int ar_rect(int length,int breadth){
        return length*breadth;
    }

    public int ar_square(int length){
        return length*length;
    }

    public float ar_circle(int radius){
        return (float)(Math.PI*radius*radius);
    }

    public static void main(String[] args) {
        System.out.println("Hello this is not a runnable file the extended files can be runnable ");
    }

}