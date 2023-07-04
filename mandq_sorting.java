 import java.util.*;
/* Class QuickSort */
public class QuickSort 
{
/* Quick Sort function */
public static int partition(int low,int high,int a[])
{
int i,j,key,temp;
i=low;
j=high+1;
key=a[low]; //assigning the first value in array as key.
while(i<=j)
{ do i++;
while(i<=high && key>=a[i]);
do j--;
while(j>=low && key<a[j]);
if(i<j)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
temp=a[low];
a[low]=a[j];
a[j]=temp;
return j;
}
public static void quick_sort(int low,int high,int a[])
{
int mid;
if(low<high)
{
mid=partition(low,high,a);
quick_sort(low,mid-1,a);//Call recursively to sort the left part
quick_sort(mid+1,high,a); //Call recursively to sort the right part
}
}
 
 /* Main method */
 public static void main(String[] args) 
 {
 Scanner scan = new Scanner( System.in ); 
 Random ran = new Random();
 System.out.println("Quick Sort Test\n");
 int n, i;
 /* Accept number of elements */
 System.out.println("Enter number of integer elements");
 n = scan.nextInt();
 /* Create array of n elements */
 int a[] = new int[n];
 /* Accept elements */
 System.out.println("\nEnter "+ n +" integer elements");
 for (i = 0; i < n; i++)
 a[i] = ran.nextInt(n);
 for (i = 0; i < n; i++)
 System.out.print(a[i]+" "); 
 long start = System.nanoTime ();
 /* Call method sort */
 quick_sort( 0, n-1,a);
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////merge sort/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
public class MergeSort 
{
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
