package Code_With_Harry_Practice_Problems;

public class Array_Sorting {
    static void printArray(int arr []){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr [] = {7,3,8,2,1};
        System.out.println("Printing the original Array : ");
        printArray(arr);

        //Bubble Sort

        for (int i=0;i< arr.length-1;i++){
            for (int j = 0;j< arr.length-i-1;j++){
                if (arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Printing the sorted array using Bubble Sort : ");
        printArray(arr);

        //Selection Sort

        for (int i = 0 ; i< arr.length;i++){
            int smallestIndex = i;
            for (int j = 0+i ; j< arr.length;j++){
                if (arr[j]<arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

        System.out.println("Printing the sorted array using Selection Sort : ");
        printArray(arr);

        //Instertion Sort

        for (int i = 0; i< arr.length;i++){
            int j = i-1;
            int current = arr[i];
            while (j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        System.out.println("Printing the sorted array using Insertion sort :");
        printArray(arr);
    }
}
