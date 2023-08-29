//ques 1 :  what will be the output of this code
// package Strings;

// public class Assignment {
//     public static void main(String[] args) {
//         String str = "abhay";
//         String str1 = "aman";
//         String str2 = "abhay";
//         System.out.println(str.equals(str1)+" "+str.equals(str2)); // output : false true
//     }

// }

// ques 2 :  what will be the output for this code

// package Strings;

// public class Assignment {
//     public static void main(String[] args) {
//         String str = "abhay".replace("a","");
//         System.out.println(str);//output: bhy

//     }

// }

//Question3: Count how many times lowercase vowel soccurred in a String entered by the user.
package Strings;

import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words or sentence: ");
        String str = scanner.nextLine();
        scanner.close();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;

            }

        }
        System.out.println("Count of vowels is : " + count);

    }

}