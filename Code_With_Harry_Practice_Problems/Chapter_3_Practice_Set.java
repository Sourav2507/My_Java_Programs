package Code_With_Harry_Practice_Problems;

import java.util.Random;
import java.util.Scanner;

public class Chapter_3_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();

        String letter ="Dear <|name|> how are you ?";
        System.out.println(letter.replace("<|name|>",name));
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

    }
}
