package Code_With_Harry_Practice_Problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Chapter_1_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to run sum pf number program \n 2 to run cgpa Calculator \n 3 to run greeting program \n 4 to run converter program \n 5 to run integer program");
        byte selection = sc.nextByte();

        if (selection==1) {
            System.out.print("Enter how many numbers you want to Add : ");
            short nos = sc.nextShort();
            System.out.println();

            float total = 0f;

            for (int i = 1; i <= nos; i++) {
                System.out.print("Enter the number : ");
                float num = sc.nextFloat();

                total += num;
            }
            System.out.println();
            System.out.println("Thus the sum of " + nos + " given numbers is " + " " + total);
        }

        if (selection ==2){
            System.out.println("Enter the number of Subjects you have");
            short no_sub = sc.nextShort();

            System.out.println("Enter the maximum Marks in each Subject");
            short max_marks = sc.nextShort();

            int total_marks = 0;

            for (int i = 1; i<=no_sub ;i++) {

                System.out.println("Enter the marks obtained in Subject "+i);
                short sub_marks = sc.nextShort();

                total_marks=total_marks+sub_marks;
            }
            double cgpa = (total_marks*10)/(max_marks * no_sub) ;
            System.out.println("Thus your cgpa is "+cgpa);
            if (cgpa<3.0){
                System.out.println("Sorry but You Failed !!");
            }
            else {
                System.out.println("Congratulations You Passed !!");
            }
        }

        if (selection==3){
            System.out.print("Please Enter your Name : ");

            String name = sc.next();

            System.out.println();
            System.out.println("Hello "+name+" Good morning have a good day !!");
        }

        if (selection==4){
            System.out.print("Enter your current Unit : ");
            String init = sc.next();
            System.out.println();

            System.out.print("Enter the Unit you want to get : ");
            String finl = sc.next();
            System.out.println();

            System.out.print("Enter the magnitude : ");
            float mag = sc.nextFloat();

            float ans;

            if (init == "km" && finl == "m"){
                ans=mag*1000;
                System.out.println("Thus "+mag+" km is equal to "+ans+" m");
            }
            else if (init == "m" && finl == "km") {
                ans=mag/1000;
                System.out.println("Thus "+mag+" m is equal to "+ans+" km");
            }
            else {
                System.out.println("This operation is currently not available !!");
            }
        }

        if (selection==5){
            System.out.print("Enter a number : ");
            Scanner sc2 = new Scanner(System.in);
            System.out.println(sc2.hasNextInt());
        }
    }
}
