package ArrayList;
import java.util.ArrayList;

public class Operations_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element ...
        list.add(2);
        list.add(54);
        list.add(22);
        list.add(66);
        // System.out.println(list);

        // // get element...
        // System.out.println(list.get(1));

        // // contains element...
        // System.out.println(list.contains(54));

        // //remove element ...
        // // System.out.println(list.remove(0));
        // // System.out.println(list);

        // //index element...
        // System.out.println(list.indexOf(54));

        // //set element...
        // list.set(0, 99);
        // System.out.print(list);

        // size()...
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");

        }
        System.out.println(list);

    }

}

