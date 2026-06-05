import java.util.Scanner;
class Quesb {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of term in the Fibonacci series: ");
        int n = s.nextInt();
        int first = 0, second = 1;   
        for (int i = 2; i < n; i++) {
            int next = first + second;
            
            first = second;
            second = next;
        }
        System.out.println("The " + n + "th term in the Fibonacci series is: " + second);
    }
}
