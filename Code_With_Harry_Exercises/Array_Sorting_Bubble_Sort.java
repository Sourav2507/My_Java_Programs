package Code_With_Harry_Exercises;

public class Array_Sorting_Bubble_Sort {

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
        System.out.println();
//
//       for (int i=0;i< arr.length-1;i++){
//           for (int j=0;j< arr.length-i-1;j++){
//                  if (arr[j]>arr[j+1]){//Swap
//                    int temp = arr[j];
//                 arr[j]=arr[j+1];
//                   arr[j+1]=temp;
//              }
//          }
//       }
//     System.out.println("Printing the sorted array : ");
//       printArray(arr);
//
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Printing the sorted array : ");
        printArray(arr);
    }
}
