package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class swaptwonumbersArraylist {
    public static void swap(ArrayList<Integer> list3,int indx1,int indx2){
        int temp = list3.get(indx1);
        list3.set(indx1,list3.get(indx2));
        list3.set(indx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(5);
        list3.add(9);
        list3.add(3);
        list3.add(6);
        
        int indx1=1, indx2=3;
        System.out.println(list3);
        swap(list3, indx1, indx2);
        System.out.println(list3);

        // sort() .. 
        Collections.sort(list3);
        System.out.println("Sorted list : "+list3);
        

        
    }
    
}


