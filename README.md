# sorting
import java.util.*;
class SelectionSort {
 void selectionSort(int array[],int n) {
 
 for (int i = 0; i <=n-1; i++) {
 int min = i;
 for (int j = i+1 ; j <=n-1; j++) {
 // To sort in descending order, change > to < in this line.
 // Select the minimum element in each loop.
 if (array[j] < array[min]) {
 min = j;
 }
 }
 // put min at the correct position
 int temp = array[i];
 array[i] = array[min];
 array[min] = temp;
 }
 }
 // driver code
 public static void main(String[] args) 
 {
 Scanner scan = new Scanner( System.in ); 
 Random ran = new Random();
 System.out.println("Selection Sort Test\n");
 int n, i;
 /* Accept number of elements */
 System.out.println("Enter number of integer elements");
 n = scan.nextInt();
 /* Create array of n elements */
 int a[] = new int[n];
 /* Accept elements */
 System.out.println("\nEnter "+ n +" integer elements");
 for (i = 0; i <n; i++)
 a[i] = ran.nextInt(n);
 for (i = 0; i <n; i++)
 System.out.print(a[i]+" "); 
 long start = System.nanoTime ();
 /* Call method sort */
 SelectionSort ss = new SelectionSort();
 ss.selectionSort(a,n);
 long end= System.nanoTime();
 /* Print sorted Array */
 System.out.println("\nElements after sorting "); 
 for (i = 0; i <n; i++)
 System.out.print(a[i]+" "); 
 System.out.println(); 
 double total=end-start;
 System.out.println (total/1000000000);
 } 
}
