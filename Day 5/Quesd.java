import java.util.Scanner;

public class Quesd {

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largestPrimeFactor = -1;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }
        }

        System.out.println("Largest Prime Factor of " + num + " is: " + largestPrimeFactor);

        sc.close();
    }
}