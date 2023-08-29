package Arrays;

import java.util.Scanner;

public class Operators_in_Arrays{
    public static void main(String[] args) {
        int a[] = new int[50];
        Scanner SC = new Scanner(System.in); // input of arrays operation
        System.out.println("The length of the array is = "+a.length);  //  .legth -> gives length of array
        System.out.println("Enter the Physics marks : ");
        a[0]=SC.nextInt();
        System.out.println("Enter the Chemistry marks : ");
        a[1]=SC.nextInt();
        System.out.println("Enter the English marks : ");
        a[2]=SC.nextInt();
        System.out.println("Enter the Hindi marks : ");
        a[3]=SC.nextInt();
        a[0]= 45;
        System.out.println(a[0]);
        SC.close();

        System.out.println("Physics marks = "+a[0]); // output of array operation
        System.out.println("Chemistry marks = "+a[1]);
        System.out.println("English marks = "+a[2]);
        System.out.println("Hindi marks = "+a[3]);

    

        int percentage = (a[0]+a[1]+a[2]+a[3])/4;
        System.out.println(percentage+"%");
    }
}

