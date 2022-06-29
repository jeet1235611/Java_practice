// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        int smallOutput = sum(n-1); // Assumption this will work
        int finalAnswer = n + sum(n-1); // This is needed to be //proved and hence it will work as well.
        return finalAnswer;
    }
    public static void main(String[] args) {
        int answer = sum(10);
            System.out.println(answer);
    }
}
