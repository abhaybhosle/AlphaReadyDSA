package BitManipulation;

public class Operations {
    public static void evenorodd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");

        } else {
            System.out.println("Odd number");
        }
    }

    public static int getithbittt(int n, int i) {
        int bitMask = 1 << i; // Get ith Bit
        if ((n & bitMask) == 0) {
            return 0;

        } else {
            return 1;
        }

    }

    public static int setithbit(int n, int i) {
        int bitMask = 1 << i; // Set ith Bit
        return n | bitMask;
    }

    public static int clearithbit(int n, int i) {
        int bitMask = ~(1 << i); // Clear ith Bit
        return n & bitMask;
    }

    public static int updateithbit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearithbit(n, i);
        } else {
            return setithbit(n, i);
        }

    }

    public static void main(String[] args) {
        evenorodd(3);
        // evenorodd(4);
        System.out.println(getithbittt(10, 2));
        System.out.println(setithbit(10, 2));
        System.out.println(clearithbit(10, 1));
        System.out.println(updateithbit(10, 2, 0));

    }

}
