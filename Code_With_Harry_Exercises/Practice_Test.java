package Code_With_Harry_Exercises;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

class sum{
    int sum(int a , int b){
        return a+b;
    }
}
public class Practice_Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sum add = new sum();
        System.out.println("Sum is "+add.sum(num1,num2));
    }
}
