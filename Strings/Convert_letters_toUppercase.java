package Strings;

public class Convert_letters_toUppercase {
    public static String toUppcase(String str) {
        StringBuilder sd = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sd.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sd.append(str.charAt(i));
                i++;
                sd.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sd.append(str.charAt(i));
            }

        }
        return sd.toString();

    }

    public static void main(String[] args) {
        String str = "hi , i am abhay"; // to print Strating letter in uppercase in each word.
        System.out.println(toUppcase(str));
    }

}
