package ArrayList;

import java.util.*;



public class FindMaxarrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(34);
        list2.add(54);
        list2.add(66);
        list2.add(77);

        int max = Integer.MIN_VALUE;
        for(int m=0;m<list2.size();m++){
            // method 1 
            // if(max<list2.get(m)){
            //     max = list2.get(m);

            //method 2
            max = Math.max(max,list2.get(m));
            }
            System.out.println("The max element is = " + max);
           
        }
       

        
    }
