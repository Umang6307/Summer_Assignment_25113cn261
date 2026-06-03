import java.util.Scanner;
class Quesd {
    // Question : To find LCM of two numbers
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num = s.nextInt();
        System.out.println("Enter second number: ");
        int x = s.nextInt();
        int lcm = (num > x) ? num : x;
        while(true) {
            if(lcm % num == 0 && lcm % x == 0) {
                System.out.println("LCM of " + num + " and " + x + " is: " + lcm);
                break;
            }
            lcm++;
        }
        s.close();
    }
}
