import java.util.Scanner;

class Quesc {

    String longestWord(String str) {
        String words[] = str.split("\\s+");

        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesc obj = new Quesc();

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.println("Longest word = " + obj.longestWord(str));
    }
}