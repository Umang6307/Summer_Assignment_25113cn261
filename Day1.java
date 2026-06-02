import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Question 1: Sum of first n natural numbers
        System.out.print("Enter n: ");
        int n = s.nextInt();

        int sum = n * (n + 1) / 2;
        System.out.println("Sum = " + sum);

        // Question 2: Multiplication Table
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // Question 3: Factorial
        System.out.print("Enter a number: ");
        int factNum = s.nextInt();

        long factorial = 1;

        for (int i = 1; i <= factNum; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + factNum + " = " + factorial);

        // Question 4: Count Digits
        System.out.print("Enter a number: ");
        int digitNum = s.nextInt();

        int count = 0;
        int temp = Math.abs(digitNum);

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);

        s.close();
    }
}