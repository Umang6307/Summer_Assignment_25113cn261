import java.util.Scanner;

class Quesc {

    void frequency(String str) {
        int freq[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Character Frequencies:");

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0 && (char) i != ' ') {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesc obj = new Quesc();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        obj.frequency(str);
    }
}