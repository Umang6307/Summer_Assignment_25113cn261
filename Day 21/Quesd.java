import java.util.Scanner;

class Quesd {

    void toUpper(String str) {
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
        }

        System.out.print("Uppercase string: ");
        System.out.println(new String(ch));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesd obj = new Quesd();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        obj.toUpper(str);
    }
}