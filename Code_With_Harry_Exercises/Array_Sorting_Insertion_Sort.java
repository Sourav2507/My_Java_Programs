package Code_With_Harry_Exercises;

public class Array_Sorting_Insertion_Sort {

    public static void printArray(int arr[]){
        System.out.println("Printing the array : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {7,2,6,1,3};

        System.out.println("Printing Original array");
        printArray(arr);

        for (int i=0;i< arr.length;i++){
            int j= i-1;
            int current = arr[i];
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        System.out.println("\nPrinting the sorted array : ");
        printArray(arr);
    }
}
