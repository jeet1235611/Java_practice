import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.println("The element at the " +  i + "th row is: " + arr[i]);
        }
    }
}
