import java.util.Scanner;

class Quesa {
    int findLength(String str) {
        int len = 0;
        char ch[] = str.toCharArray();

        for (char c : ch) {
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesa obj = new Quesa();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length = " + obj.findLength(str));
    }
}