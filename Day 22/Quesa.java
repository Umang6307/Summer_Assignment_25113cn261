import java.util.Scanner;

class Quesa {

    boolean isPalindrome(String str) {
        str = str.toLowerCase();
        char ch[] = str.toCharArray();

        int i = 0, j = ch.length - 1;

        while (i < j) {
            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesa obj = new Quesa();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (obj.isPalindrome(str))
            System.out.println("Palindrome string");
        else
            System.out.println("Not a palindrome string");
    }
}