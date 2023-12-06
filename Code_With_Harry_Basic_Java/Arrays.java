package Code_With_Harry_Basic_Java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        /*System.out.print("Enter the length of the Array : ");
        short l = sc.nextShort();

        float [] marks = new float [l];

          for (short i = 0 ; i<l ;i++) {
              System.out.print("Enter marks of Subject "+(i+1)+" : ");
              float mark = sc.nextShort();

              marks[i] = mark;
          }
            System.out.print("Your Marks are : ");
        for (float element:marks){
            System.out.print(element+" ");
        }*/

        //2D Arrays
        System.out.print("Enter the number of floors in your Apartment : ");
        short h = sc.nextShort();

        System.out.print("Enter the number of rooms in each floor : ");
        short l = sc.nextShort();


        short [][] apartment = new short[h][l];
        short room_no ;

        System.out.println("Thus available rooms in your apartment having "+h+" floors and  "+l+" rooms in each floor "+" is :- ");

        for (short i = 1 ; i<h ;i++){
            for (short j=1;j<(l+1)  ;j++){
                room_no = (short) ((i*100) + j);
                System.out.print(room_no+" ");
            }
            System.out.println();
        }
    }
}