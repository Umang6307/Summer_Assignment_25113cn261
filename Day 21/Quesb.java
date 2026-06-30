import java.util.Scanner;

class Quesb {

    void reverseString(String str) {
        char ch[] = str.toCharArray();

        System.out.print("Reversed string: ");
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesb obj = new Quesb();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        obj.reverseString(str);
    }
}