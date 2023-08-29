// package Strings;

// public class Largest_String {
//     public static void main(String[] args) {
//         String fruits[] = { "apple", "mango", "orange" };

//         String Largest = fruits[0];
//         for (int i = 0; i < fruits.length; i++) {
//             if (Largest.compareTo(fruits[i]) < 0) {
//                 Largest = fruits[i];

//             }

//         }
//         System.out.println(Largest);
//     }

// }
package Strings;

public class Largest_String {

    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };
        String Largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(Largest.compareTo(fruits[i])<0){
                Largest=fruits[i];

            }

        }
        System.out.println(Largest);
    }
}