package Code_With_Harry_Practice_Problems;

import java.util.Scanner;

public class Chapter_6_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem 1(Sum of elements in an Array)

        /*System.out.print("Enter how many numbers you want to add : ");
        int l = sc.nextInt();

        float [] numbers = new float[l];

        float sum = 0.0f;

        for (short i = 0;i<l;i++){
            System.out.print("Enter number to be added : ");
            float n = sc.nextFloat();
            numbers[i]=n;
            sum+=n;
        }
        System.out.print("Thus your elements are : ");
        for (float element:numbers){
            System.out.print(element+" ");
        }
        System.out.println("\n The sum of elements of the array is : "+sum);

        System.out.println("Problem 1 ends here !!");*/

        //Problem 2(Checking the presence of a particular element)

        /*System.out.print("Enter the number of Entries you want to make : ");
        short f = sc.nextShort();
        System.out.println();

        float [] Numbers = new float[f];

        for (short i = 0 ;i<f; i++){
            System.out.print("Enter number : ");
            float n = sc.nextFloat();
            Numbers[i]=n;
        }

        System.out.print("\n Enter the number you are searching for : ");
        float findnum = sc.nextFloat();

        byte pos = 0;
        for (float elements : Numbers){
            if (elements==findnum){
                System.out.println("Hurray ! Your number has been found at "+pos+"th position of the Array !");
            }
            else {
                System.out.println("Sorry but the entered Number don't exist in the array");
            }
            pos++;
}
            System.out.println("Problem 2 ends here !!");*/

        //Problem 3(Average Marks USing an Array)

        /*System.out.print("Enter the total number of students : ");
        short stu = sc.nextShort();

        float [] marks = new float[stu];

        float sum = 0f;

        System.out.println();
        for (short i = 0 ; i<stu;i++){
            System.out.print("Enter the marks of Student "+(i+1)+" : ");
            float mark = sc.nextFloat();

            marks[i]=mark;

            sum+=mark;
        }

        float avg = sum/stu;

        System.out.println("\n Thus the Average marks is : "+avg);

        System.out.println("Problem 3 ends here !!");*/

        //Problem 4(Sum of Matrices using Array)

        /*System.out.println("Enter the number of rows of the Matrix : ");
        short m = sc.nextShort();

        System.out.println("Enter the number of columns of the Matrix : ");
        short n = sc.nextShort();

        float[][] A = new float[m][n];

        System.out.println("Enter the elements for matrix A : ");

        for (short i = 0; i < m; i++) {
            for (short j = 0; j < n; j++) {
                System.out.print("Enter the element at m = " + (i + 1) + " and n = " + (j + 1) + " : ");
                float element = sc.nextFloat();

                A[i][j] = element;
            }
        }
            float[][] B = new float[m][n];

            System.out.println("Enter the elements for matrix B : ");

            for (short i = 0; i < m; i++) {
                for (short j = 0; j < n; j++) {
                    System.out.print("Enter the element at m = " + (i + 1) + " and n = " + (j + 1) + " : ");
                    float element = sc.nextFloat();

                    B[i][j] = element;
                }
            }

        float[][] C = new float[m][n];

        for (short i = 0; i < m; i++) {
            for (short j = 0; j < n; j++) {

               C[i][j] = B[i][j] + A[i][j] ;
            }
        }

        System.out.println("Thus Matrix A is given as : \n ");
        for (short i = 0;i<m;i++){
            for (short j = 0; j < n; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Thus Matrix B is given as : \n ");
        for (short i = 0;i<m;i++){
            for (short j = 0; j < n; j++) {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Thus Matrix C is given as : \n ");
        for (short i = 0;i<m;i++){
            for (short j = 0; j < n; j++) {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Problem 4 ends here !!");*/

        //Problem 5(Reversing an Array)

        /*System.out.print("Enter the Length of your array : ");
        short l = sc.nextShort();

        float [] ARRAY = new float[l];
        float [] REVERSE = new float[l];

        for (short i = 0 ; i<l; i++){
            System.out.print("Enter the element : ");
            float ele = sc.nextFloat();

            ARRAY[i] =ele;
            REVERSE[(l-i-1)] = ele;
        }
        System.out.print("Your Entered Array is :\t\t ");
        for (short i = 0 ; i<l; i++){
            System.out.print(ARRAY[i]+"\t");
        }
        System.out.println();

        System.out.print("Thus the Reversed Array is :    ");
        for (short i = 0 ; i<l; i++){
            System.out.print(REVERSE[i]+"  ");
        }
        System.out.println();

        System.out.println("Problem 5 ends here !!");*/

        //Problem 6(Highest Element)

        /*System.out.print("Enter the Length of your array : ");
        short l = sc.nextShort();

        float [] ARRAY = new float[l];
        float maximum = -300f;

        for (short i = 0 ; i<l; i++) {
            System.out.print("Enter the element : ");
            float ele = sc.nextFloat();

            ARRAY[i] = ele;

            if (ele>maximum){
                maximum=ele;
            }
        }
        System.out.println("Thus the Maximum value contained in the Entered Array is : "+maximum);

        System.out.println("Problem 6 ends here !!");*/

        //Problem 7(Lowest Element)

        /*System.out.print("Enter the Length of your array : ");
        short l = sc.nextShort();

        float [] ARRAY = new float[l];
        float minimum = 3402823000f;

        for (short i = 0 ; i<l; i++) {
            System.out.print("Enter the element : ");
            float ele = sc.nextFloat();

            ARRAY[i] = ele;

            if (ele<minimum){
                minimum=ele;
            }
        }
        System.out.println("Thus the Minimum value contained in the Entered Array is : "+minimum);

        System.out.println("Problem 7 ends here !!");*/

        //Problem 8(Checking the Order)

        /*System.out.print("Enter the Length of your array : ");
        short l = sc.nextShort();

        float [] ARRAY = new float[l];
        float minimum = 3402823000f;

        boolean ordered = false;
        boolean ascending = false;

        for (short i = 0 ; i<l; i++) {
            System.out.print("Enter the element : ");
            float ele = sc.nextFloat();

            ARRAY[i] = ele;

            if (i>0 && i<(l-1)){
                if (ARRAY[(i-1)]<ele){
                    ordered=true;
                    ascending=true;
                }
                else if (ARRAY[i-1]>ele) {
                    ordered=true;
                    ascending=false;
                }
                if (i>1 && i<(l-1)){
                 if ((ARRAY[i-1]>ele && ARRAY[i-2]<ARRAY[i-1])||(ARRAY[i-1]<ele && ARRAY[i-2]>ARRAY[i-1])){
                        ordered = false;
                        ascending = false;
                    }
                }
            }
        }

        if (ordered == true && ascending == true){
            System.out.println("This Array is ordered in Ascending Order !!");
        }
        else if (ordered == true && ascending == false) {
            System.out.println("This Array is ordered in Descending Order !!");
        }
        else {
            System.out.println("This Array is not an Ordered Array !!");
        }

        System.out.println("Problem 7 ends here !!");*/
    }
}