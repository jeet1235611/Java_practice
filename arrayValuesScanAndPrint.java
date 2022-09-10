import java.util.*;
import java.util.Scanner;
class mergeSort {
  public static void main(String args[]) {
    System.out.println("Enter the value of array");
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    int arr[] = new int[100];
    //Enter the value in the array.
    for(int i = 0; i < b; i++) {
      arr[i] = sc.nextInt();
    }

    //Printing the values in the array.
    for(int i = 0; i < b; i++) {
      System.out.println(arr[i]);
    }
  }
}

/*public static void mergeSort(int a[]) {
  if(a.length <= 1)
    return;
    int b[] = new int[a.length/2];
    int c[] = new int[a.length-b.length];

    for(int i = 0; i < a.length/2; i++) {
      b[i] = a[i];

    }
}
*/
