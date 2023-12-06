package Code_With_Harry_Exercises;

public class Array_Sort_Test {
//    public static void printArray(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//
//    public static void main(String args[]) {
//        int arr[] = {7, 8, 1, 3, 2};
//
//        System.out.println("Printing original array : ");
//        printArray(arr);
//
//        //bubble sort
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//
//        printArray(arr);
//    }



    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 3, 2};

        System.out.println("Printing Original array");
        printArray(arr);


        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }


        System.out.println("Printing sorted array");
        printArray(arr);
    }
}