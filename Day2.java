// all the below question the output of the desired question will be obtained after commenting out the other questions after ther question numbers
import java.util.Scanner;
public class Day2 {
    public static void main(String[] args)
     {
        // Question 1: sum of digits of a number
        System.out.println("enter a number for there sum of digits");
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int sum = 0;
        for (int num = a; num > 0; num /= 10) {
            sum += num % 10;
        }
        System.out.println("sum of the digits of the number is: " + sum);
        // s.close(); is an optional statement
       s.close();
  }

    {   // Question 2: reverse of a number
        System.out.println("enter a number for there reverse");
        Scanner s = new Scanner(System.in);
        int c= s.nextInt();
      int reverse = 0;
        for (int num = c; num > 0; num /= 10) {
          reverse = reverse * 10 + num % 10;
        }
        System.out.println("reverse of the number is: " + reverse);
     s.close();
    }
   
    {   // Question 3: multiplication of digits of a number
        System.out.println("enter a number for there multiplication of digits");
        Scanner s = new Scanner(System.in);
        int b= s.nextInt();
        int mul = 1;
        for (int num = b; num > 0; num /= 10) {
            mul *= num % 10;
        }
        System.out.println("multiplication of the digits of the number is: " + mul);
         s.close();
    }

  {//Question 4: check if a number is palindrome or not
   Scanner s = new Scanner(System.in);
    System.out.println("enter a number for there palindrome");
    int d= s.nextInt();
    int rev=0;
    for(int num=d; num>0;num/=10)
    {
        rev=rev*10+num%10;
    }
    if(d==rev)
    {
        System.out.println("the number " + d + " is palindrome");
    }
    else
    {
        System.out.println("the number " + d + " is not palindrome");
    }
     s.close();
   }
}
// Note: To get the output of a particular question, comment out the other questions after their question numbers.