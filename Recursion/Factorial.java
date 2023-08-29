package Recursion;

public class Factorial {
    public static int Fact(int n){
        if(n==0){ // Base Case
            return 1;
        }
        int fnm = Fact(n-1); // Funt call
        int fn = n*fnm;
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));;
    }
    
}
