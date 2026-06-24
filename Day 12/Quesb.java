import java.util.Scanner;

public class Quesb {

    static boolean isArmstrong(int num) {
        int original = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num = num / 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

        sc.close();
    }
}