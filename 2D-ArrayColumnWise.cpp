// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
int rows = sc.nextInt();
System.out.println("Enter the number of columns");
int cols = sc.nextInt();
int [][]arr = new int[5][5];
System.out.println("Enter the values in the rows and columns");
for(int i = 0; i < rows; i++) {
    for(int j = 0; j < cols; j++) {
        System.out.println("Enter the element in the " + i + " th row and " + j + " th column" );
        arr[i][j] = sc.nextInt();
    }
}  
 //Printin elements in the 2 D matrix or the 2 D array
    
    for(int i = 0; i < rows; i++) {
        for(int j = 0; j < cols; j++) {
            System.out.print(arr[j][i] + " ");
        }
        System.out.println();
    }
    }
}
