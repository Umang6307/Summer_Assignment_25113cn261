import java.util.Scanner;

public class Quesb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

       
        int digits = 0;
        for (int t = num; t > 0; t = t / 10) {
            digits++;
        }

        for (int i = 0; i < digits; i++) {
            int digit = temp % 10;

            
            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact *= j;
            }

            sum += fact;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is NOT a Strong Number.");
        }

        sc.close();
    }
}
