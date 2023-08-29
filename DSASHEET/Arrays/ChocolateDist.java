/*Given an array of N integers where each value represents the number of chocolates in a packet. 
Each packet can have a variable number of chocolates. There are m students,the task is to distribute
chocolate packets such that: Each student gets one packet.The difference between the number of
chocolates in the packet with maximum chocolates 
and the packet with minimum chocolates given to the students is minimum.*/
package DSASHEET.Arrays;
import java.util.*;

public class ChocolateDist {
    public static int chocolate(int arr[],int n,int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff = arr[i+m-1]-arr[i];
            if(diff<min){
                min=diff;
            }

        }
        return min;

    }
    public static void main(String[] args) {
        int arr[] = {7,3,2,4,9,12,56};
        // [2,3,4,7,9,12,56] sorted array
        int n=arr.length;
        int m=3;
        System.out.println(chocolate(arr, n, m));
       
    }
    
}

