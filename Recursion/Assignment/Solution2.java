/*
You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”. 
 Use a recursive function to solve this problem.
 NOTE-Th digits of the number will only be in the range 0-9 and the lastdigit of a number can’t be 0
 */
package Recursion.Assignment;

public class Solution2 {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void Printdigit(int number) {
        if (number == 0) {
            return ;
        }
        int lastDigit = number % 10;
        Printdigit(number / 10);
        System.out.println(digits[lastDigit] + " ");

    }

    public static void main(String[] args) {
        Printdigit(1234);

    }

}
