import java.util.ArrayList;
import java.util.Iterator;

public class StringMethods {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        String s = "potato apple lemon";
        String[] vector = s.split(" ");
        String word1 = vector[0];

        ArrayList<String> contacts = new ArrayList<>();

        contacts.add("Joel Vitor; 21 96969-3229");
        contacts.add("Rafa City; 21 96969-3223");

        System.out.println("Original is: -" + original + '-');
        System.out.println("toLowerCase is: -" + s01 + '-');
        System.out.println("toUpperCase is: -" + s02 + '-');
        System.out.println("Trim is: -" + s03 + '-');
        System.out.println("Substring(2) is: -" + s04 + '-');
        System.out.println("Substring(2, 9) is: -" + s05 + '-');
        System.out.println("Replace('a', 'x') is: -" + s06 + '-');
        System.out.println("Replace ('abc', 'x') is: -" + s07 + '-');
        System.out.println("Index of 'bc' is: " + i);
        System.out.println("lastIndexOf of 'bc' is: " + j);
        System.out.println("Split of word1 is: " + word1);

        int a;

        a = 0;

        for(String contact: contacts) {
            System.out.printf("Posição %d- %s\n", a, contact);
            a++;
        }


    }
}
