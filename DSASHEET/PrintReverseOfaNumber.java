package DSASHEET;

public class PrintReverseOfaNumber {
    public static void main(String[] args) {
        int n = 1234;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        System.out.println();
    }
}

/* 1)  When you want last digit of any number , use % and divide it by 10 -> to get
 the remainder (n%10)
 2) when you want to remove the last digit of any number , use / and divide it by 10 -> to remove the last number (n/10)
*/