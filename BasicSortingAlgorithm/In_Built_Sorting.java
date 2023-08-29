// package BasicSortingAlgorithm;
// import java.util.Arrays;

// public class In_Built_Sorting {
//     public static void Printarr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");

//         }
//         System.out.println();

//     }
//     public static void main(String[] args) {
//         int arr[] = {100,43,55,7,8,9,23};
//         Arrays.sort(arr); // InBuilt Function --> Ascending order
//         Arrays.sort(arr,0,3);
//         Printarr(arr);
      

//     }
    
// }

package BasicSortingAlgorithm;
import java.util.Arrays;
import java.util.Collections;

public class In_Built_Sorting {
    public static void Printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
    public static void main(String[] args) {
        Integer arr[] = {100,43,55,7,8,9,23};
        Arrays.sort(arr,Collections.reverseOrder()); // InBuilt Function --> Descending order
        Arrays.sort(arr,0,3,Collections.reverseOrder());

        Printarr(arr);
      

    }
    
}




