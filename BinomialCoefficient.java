import java.util.Scanner;

public class BinomialCoefficient {
    public static int Fact(int n) {
        if(n==0 || n == 1) 
            return 1;
        else
            return n*Fact(n-1);
    }
    public static int BinCoeff(int n, int r) {
        int n_fact = Fact(n);
        int r_fact = Fact(r);
        int n_min_r_fact = Fact(n-r);
        int binCoeff = n_fact/(r_fact*n_min_r_fact);
        System.out.println("The Binomial Coefficient : " + binCoeff); 
        return 0;
    }
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n = read.nextInt();
            System.out.print("Enter the value of r: ");
            int r = read.nextInt();
            System.out.print("Factorial of " + n + " : ");
            int ans = Fact(n);
            System.out.println(ans);
            BinCoeff(n, r);

        }
    }  
}
