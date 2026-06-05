import java.util.Scanner;
class Quesa {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = s.nextInt();
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);

            first = second;
            second = next;
        }
        System.out.println(second);
        s.close();
    }
}