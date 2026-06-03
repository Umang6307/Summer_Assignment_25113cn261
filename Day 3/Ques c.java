import java.util.Scanner;
class Quesc {
    // Question : To find GCD of two numbers 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num = s.nextInt();
        System.out.println("Enter second number: ");
        int x = s.nextInt();
        int gcd = 1;
        for(int i=1; i<=num && i<=x; i++) {
            if(num % i == 0 && x % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + num + " and " + x + " is: " + gcd);
        s.close();
    }
}
