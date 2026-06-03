import java.util.Scanner;
class Quesb {
    // Question : To find prime number in a range
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a minimum number of the range: ");
        int x = s.nextInt();
        System.out.println("Enter a maximum number of the range: ");
        int num = s.nextInt();
        int count = 0;
        for (int i=x; i<=num; i++)
        {
            if(i <= 1) {
                continue;
            } else {
                boolean isPrime = true;
                for (int j = 2; j <= i / 2 ; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true ) {
                    System.out.println(i + " is prime.");
                    count++;
                }
            }
        }
        System.out.println("Total prime numbers between " + x + " and " + num + " is: " + count);
        s.close();
    }
}
