import java.util.*;
public class anagrams {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            String str1 = sc.next();
            
            str = str.toLowerCase();
            str1 = str1.toLowerCase();

            if(str.length() == str1.length()) {
                char[] strcharArray = str.toCharArray();
                char[] str1charArray = str1.toCharArray();

                Arrays.sort(strcharArray);
                Arrays.sort(str1charArray);

                boolean result = Arrays.equals(strcharArray, str1charArray);
                if(result) {
                    System.out.println("They are anagrams");
                }
                else {
                    System.out.println("They are not Anagrams");
                }
            }
        }
    }
}
