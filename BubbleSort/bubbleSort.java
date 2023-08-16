package sortings;
import java.util.*;
public class bubbleSortAlgo {
   /*
   Note : if we N elements in an unsorted array
   by placing (n -1) elements on correct position we will get
   sorted array..
     */
    public static void main(String[] args) {
        // Bubbles
        // sort unsorted array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // this loop for taking array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(n, arr);
//        System.out.print(arr[i] + " ");
//        System.out.print(Arrays.toString(arr));
        // iterate each number from array to n - 1;


    }

    public static void bubbleSort(int n, int[] arr) {
       int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i -1; j++) {
            if (arr[j] > arr[j + 1]) {
                arr[j + 1] = temp;

             }
            }
        }
    }
}
