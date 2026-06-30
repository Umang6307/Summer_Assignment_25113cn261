import java.util.Scanner;

class Quesb {

    void commonChars(String s1, String s2) {
        int freq1[] = new int[256];
        int freq2[] = new int[256];

        for (char ch : s1.toCharArray()) {
            freq1[ch]++;
        }

        for (char ch : s2.toCharArray()) {
            freq2[ch]++;
        }

        System.out.print("Common characters: ");

        for (int i = 0; i < 256; i++) {
            if (freq1[i] > 0 && freq2[i] > 0 && (char) i != ' ') {
                System.out.print((char) i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesb obj = new Quesb();

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        obj.commonChars(s1, s2);
    }
}