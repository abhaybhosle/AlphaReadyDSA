// package Recursion;

// public class power { // o(n)
//     public static int powerF(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         int xnm1 = powerF(x, n - 1);
//         int xn = x * xnm1;
//         return xn;
//         // (or)
//         // return x * power(x, n - 1);
//     }

//     public static void main(String[] args) {
//         System.out.println(powerF(2, 3));

//     }

// }

// optimised code 

package Recursion;

public class power { // o(logn)
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowersq = halfPower * halfPower;

        // if n is odd
        if (n % 2 != 0) {
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;

    }

    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimizedPower(a, n));

    }

}
