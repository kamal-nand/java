/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class CNDY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (// your code goes here 
        Scanner read = new Scanner(System.in)) {
            int T = read.nextInt();
            for(int i = 0; i < T; i++) {
                int N = read.nextInt();
                int[] arr = new int[2*N];
                int count = 0;
                for(int j = 0; j < (2*N); j++) {
                    arr[i] = read.nextInt();
                }
                for(int j = 0; i < 2*N-1; j++) {
                    for(int k = 0; k < 2*N; k++) {
                        if(arr[j] == arr[k]) {
                            count++;
                        }
                    }
                }
                if ( count > 2) {
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }
        }
	}
}
