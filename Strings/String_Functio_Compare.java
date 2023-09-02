package Strings;

public class String_Functio_Compare {
    public static void main(String[] args) {
        String str1 = "Abhay";
        String str2 = "Abhay";
        String str3 = new String("Abhay");

        //substring  // end index number is excluded
        System.out.println(str1.substring(0,5)); 

        if (str1 == str2) {
            System.out.println("Strings are equal");

        }

        else {
            System.out.println("Strings are not equal");
        }
        // if(str1==str3){
        // System.out.println("Strings are equal");

        // }
        // output it is not equal , as str3 creates a new string in
        // the heap
        // and the memory located in the stack will point towards the new string created
        // in the heep..

        if (str1.equals(str3)) { // equal function
            System.out.println("Strings are equal");

        } else {
            System.out.println("Strings are not equal");
        }
    }
    

}
