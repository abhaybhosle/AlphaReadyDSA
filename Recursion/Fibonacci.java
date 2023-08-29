// Fibonacci series [0,1,1,2,3,5,8,13,21..]
// formula for any index vale fn = (fn-1) + (fn-2)

package Recursion;

public class Fibonacci {
    public static int fibo(int n) {
        if (n == 0 || n == 1) { // Base Case
            return n;
        }
        int fnm1 = fibo(n - 1);   // fnm1 = fino of n - 1 
        int fnm2 = fibo(n - 2);   // fnm2 = fibo of n  -2
        int fn = fnm1 + fnm2;
        return fn;

    }

    public static void main(String[] args) {
        int n = 5; // index value
        System.out.println(fibo(n));

    }
}
