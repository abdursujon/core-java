import java.util.*;
import java.io.*;

public class ForLoop{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt(); // number of queries
        for(int i = 0; i < q; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += (int) Math.pow(2, j); // if n = 10, j runs 10 times
                System.out.print(a + sum * b);
                if(j < n -1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /**
         * Given a, b, and n, generate a series of n terms where the i-th term (starting from 0) is:
         * a + b · (3^0 + 3^1 + ... + 3^i)
         * Input: q queries, each with a, b, n.
         * Sample Input:
         * 1
         * 2 1 5
         * Sample Output:
         * 3 6 15 42 123
         */
        Scanner sc = new Scanner(System.in);
        int q2 = sc.nextInt();
        for(int i = 0; i < q2; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += (int) Math.pow(3, j);
                System.out.print(x + y * sum);
                if(j < n - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}