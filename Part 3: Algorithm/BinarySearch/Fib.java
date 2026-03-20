public class SequentialVersusBinarySearch {
    // Fibonacci without using array time = O(n), space =
    public static int fib(int n) {
        int a = 1, b = 1;
        int c = 0;
        for(int i = 3; i<= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
