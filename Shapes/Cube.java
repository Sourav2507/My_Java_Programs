package Shapes;
import java.util.Scanner;

public class Cube extends shape {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);

        shape cube = new shape();

        System.out.print("Enter length of the cube : ");
        int l = sc.nextInt();

        System.out.println("Volume of the cube is "+(cube.ar_square(l)*l));
    }
}
