/* Java Program to Implement Merge Sort*/
import java.util.*;
/* Class MergeSort */
public class MergeSort 
{
 /* Merge Sort function */
 public static void simple_merge(int[] a, int low,int mid, int high) 
 {
 // merge two sorted subarrays
 int[] b = new int[1000];
 int i=low, j=mid+1, k=low;
 while ( i<=mid && j<=high )
 {
if( a[i] <= a[j] )
 b[k++] = a[i++] ;
 else
 b[k++] = a[j++] ;
 }
 while (i<=mid)
 b[k++] = a[i++] ;
 while (j<=high)
 b[k++] = a[j++] ;
 for(k=low; k<=high; k++)
 a[k] = b[k];
 
 } 
 public static void sort(int[] a,int low,int high)
 {
 if (low>=high) 
 return; 
 int mid = (low + high)/2; 
 // recursively sort 
 sort(a, low, mid); 
 sort(a, mid+1, high); 
 simple_merge(a,low,mid,high);
 }
 
 /* Main method */
 public static void main(String[] args) 
 {
 Scanner scan = new Scanner( System.in ); 
 Random ran = new Random();
 System.out.println("Merge Sort Test\n");
 int n, i;
 /* Accept number of elements */
System.out.println("Enter number of integer elements");
 n = scan.nextInt();
 /* Create array of n elements */
 int a[] = new int[ n ];
 /* Accept elements */
 System.out.println("\nEnter "+ n +" integer elements");
 for (i = 0; i < n; i++)
 a[i] = ran.nextInt(n);
 for (i = 0; i < n; i++)
 System.out.print(a[i]+" "); 
 
 long start = System.nanoTime ();
 /* Call method sort */
 sort(a, 0, n-1);
 long end= System.nanoTime();
 /* Print sorted Array */
 System.out.println("\nElements after sorting "); 
 for (i = 0; i < n; i++)
 System.out.print(a[i]+" "); 
 System.out.println(); 
 double total=end-start;
 System.out.println (total/1000000000);
 }
 }
