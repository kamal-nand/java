import java.util.Scanner;

public class BUY1GET1{
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int t = read.nextInt();
            while(t-- != 0) {
                String S = read.next();
                int count = 0;
                for(int i = 0; i < S.length(); i++) {
                    if(S.charAt(i) == S.charAt(i+1))
                    {
                        count++;
                        i++;
                    }
                    else {
                        count++;
                    }    
                }
                System.out.println(count);
            }
        }
    }
}
