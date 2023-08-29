package ArrayList;
import java.util.*;
public class reverseofArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("The Oiginal array is : "+list1);
        for(int j=list1.size()-1; j>=0; j--){
            System.out.println(list1.get(j) + " ");

        }
        System.out.println();

        
        
    }
    
}


