import java.util.Scanner;

public class Quesd {

    static int reverse = 0;

    static int reverseNumber(int n) {
        if (n == 0)
            return reverse;

        reverse = reverse * 10 + (n % 10);
        return reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Reversed number = " + reverseNumber(n));

        sc.close();
    }
}