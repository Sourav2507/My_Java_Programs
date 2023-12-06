package Geeks_for_Geeks_Practice;

//Question :Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.
//
//Example 1:
//
//Input:
//N = 5
//arr[] = {1 2 3 4 5}
//K = 4
//Output: 3
//Explanation: 4 appears at index 3.

import java.util.Scanner;

public class Practice_Problem_1_Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array : ");
        int N = sc.nextInt();
        int arr [] = new int[N];

        System.out.println("Enter starting element of the array : ");
        int entry = sc.nextInt();

        for (int i = 0 ; i< N;i++){
            arr[i]=entry;
            entry++;
        }

        System.out.println("Enter any number to find in the array list : ");
        int K = sc.nextInt();

        int index = 0;
        for (int element:arr) {
            if (K==element){
                System.out.println("Your element is at the index "+index);
                break;
            }
            index++;
        }
    }
}
