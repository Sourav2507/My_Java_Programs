package Code_With_Harry_Exercises;

public class Array_Sorting_Selection_Sort {

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

//        for (int i = 0;i< arr.length-1 ; i++){
//            int smallestIndex = i;
//            for (int j = 1+i ; j< arr.length; j++){
//                if (arr[j]<arr[smallestIndex]){
//                    smallestIndex = j;
//                }
//            }
//            int temp = arr[smallestIndex];
//            arr[smallestIndex]=arr[i];
//            arr[i]=temp;
//        }



        for (int i=0;i< arr.length-1;i++){
            int smallestIndex=i;
            for (int j=0+i;j<arr.length;j++){
                if (arr[smallestIndex]>arr[j]){
                    smallestIndex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[smallestIndex];
            arr[smallestIndex]=temp;
        }



        System.out.println("\nPrinting the sorted array : ");
        printArray(arr);
    }
}
