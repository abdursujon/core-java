package Recursive;

public class IterativeFactorialAlgorithm {
    // Repetitive method
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = i * fact;
        }
        return fact;
    }

    // Recursion method
    public static int recursionFactorial(int n){
        if(n == 1) return 1;
        return n * recursionFactorial(n - 1);
    }

    public static void main(String[] java){
        System.out.println(factorial(5));
        System.out.println(recursionFactorial(5));
    }
}
