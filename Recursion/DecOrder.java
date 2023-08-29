package Recursion;

public class DecOrder {
    public static void PrintInc(int n){
        if(n==1){ // Base Case
            System.out.println(1);
            return;

        }
        
        PrintInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        PrintInc(n);
    }
}



// package Recursion;

// public class DecOrder {
//     public static void PrintDec(int n){
//         if(n==1){
//             System.out.print(1);
//             return;

//         }
//         System.out.print(n+" ");
//         PrintDec(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         PrintDec(n);
//     }
// }

