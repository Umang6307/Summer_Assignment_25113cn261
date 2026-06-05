import java.util.Scanner;
public class Quesd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int n = sc.nextInt();

        System.out.print("Enter the upper limit: ");
        int x = sc.nextInt();

       // This code will only show all the three digit armstrong numbers in the given range it will not work for the four digit armstrong numbers
        System.out.println("Armstrong numbers in the range:");

        for (int num = n; num <= x; num++) {
            int sum = 0;

            for (int temp = num; temp > 0; temp /= 10) {
                int digit = temp % 10;
                sum += digit * digit * digit;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}