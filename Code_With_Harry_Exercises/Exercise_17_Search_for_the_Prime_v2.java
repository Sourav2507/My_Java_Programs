package Code_With_Harry_Exercises;

import java.util.Scanner;

class primeChecker{
    public boolean prime_check(int a){
        boolean prime = true;
        if (a>2){
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    prime = false;
                    break;
                }
            }
        } else if (a==2) {
            prime = true;
        }
        else {
            prime = false;
        }
        return prime;
    }
}

public class Exercise_17_Search_for_the_Prime_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Range, for which you want to print the Odd numbers");
        System.out.print("\nEnter minimum Value: ");
        int min = sc.nextInt();

        System.out.print("Enter maximum Value: ");
        int max = sc.nextInt();

        primeChecker number = new primeChecker();

        if (min<max) {
            System.out.print("\nPrime numbers lying in the range "+min+" to "+max+" are : ");
            for (int i = min; i <= max; i++) {
                if (number.prime_check(i)){
                    System.out.print(" "+i+" ");


                }

            }
        }
        else {
            System.out.println("Invalid Input range ");
        }
    }
}
