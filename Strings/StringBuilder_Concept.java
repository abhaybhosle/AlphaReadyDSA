package Strings;

public class StringBuilder_Concept {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);

        }
        System.out.println(sb + " ");
        System.out.println(sb.length());

    }

}
