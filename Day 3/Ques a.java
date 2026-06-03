import java.util.Scanner;

class Quesa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Question : Check if a number is prime or not
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not prime.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2 ; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true ) {
                System.out.println(num + " is prime.");
            } else {
                System.out.println(num + " is not prime.");
            }
        }

        s.close();
    }
}