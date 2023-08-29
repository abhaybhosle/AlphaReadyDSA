package Recursion;

public class Sum_Of_n_naturalnumbers {
 
    public static int CalSum(int n){
        if(n==1){
            return 1;
          
        }
        int a = CalSum(n-1);
        int b = n+a;
        return b;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalSum(n));
    }
    
}
