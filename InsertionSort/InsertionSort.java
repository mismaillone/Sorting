import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        
        insertionSort(array,n);
    }
	 static void insertionSort(int a[], int n)
    {
       for(int i = 0; i < n; i++) {
		   int j = i;
		   while(j > 0 && a[j -1] > a[j]) {
			   int temp = a[j];
			   a[j] = a[j - 1];
			   a[j- 1] = temp;
			   j--;
		   }
	   }
		for (int i = 0; i < n ; i++) {
			System.out.print(a[i]+ " ");
		}
    }
}
