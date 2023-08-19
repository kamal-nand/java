import java.util.Scanner;

public class Reverse {
    public static void reverse(int idx, String str) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(idx-1, str);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the word to be converted into reversed form: ");
            String name = sc.next();
            System.out.print("Reversed word: ");
            reverse(name.length()-1, name );
        }
    }
    
}
