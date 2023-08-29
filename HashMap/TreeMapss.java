package HashMap;
import java.util.*;
public class TreeMapss {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 105);
        tm.put("Pakistan", 100);

        System.out.println(tm); //keys are sorted  in alphabatecial order
    }
}
