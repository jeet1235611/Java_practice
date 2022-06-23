// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        char arr[] = { 'c', '0', 'd', 'i', 'n', 'g' };
        String str = " Jeet ";
        String str1 = "Coding";
        String str2 = " is fun";
        String str3 = "coding";
        String str4 = "boding";
        str1 = str1 + str2;
        str1 = str1.concat(str2);

        System.out.println(str1.equals(str2) + "\n");
        System.out.println();
        System.out.println(str1 + str2);
        System.out.println(str1.length());
        System.out.println(str.charAt(2)+ "\n");
        System.out.println(str1.compareTo(str2)+"\n");
        System.out.println(str3.compareTo(str4));
        System.out.println(str4.contains("ing"));
    }
}
