package Arrays;


public class Largest_Smallest_in_Array {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];

            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];

            }

        }
        System.out.println("The smallest element is = " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Largest value is : " + getlargest(numbers));
    }
}
