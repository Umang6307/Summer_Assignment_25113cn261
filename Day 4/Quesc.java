import java.util.Scanner;
public class Quesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;

        // this code will check only for the three digit armstrong numbers it will not work for the four digit numbers
        for (; num > 0; num /= 10) {
            int digit = num % 10;
            sum += digit * digit * digit;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }

        sc.close();
    }
}