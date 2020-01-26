
package recursionpractice;


public class RecursionPractice {
    
    public static int Summation(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        } else {
            return n + Summation(n-1);
        }
    }
    
    public static int Factorial(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    }
    
    public static int Fibonacci(int n) {
        if (n <= 1) {
            if (n == 1) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Summation(5));
        System.out.println(Summation(2));
        System.out.println(Summation(3));
        System.out.println(Factorial(0));
        System.out.println(Factorial(3));
        System.out.println(Factorial(5));
        System.out.println(Fibonacci(10));
    }
    
}
