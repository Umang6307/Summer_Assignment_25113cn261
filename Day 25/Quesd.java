import java.util.Scanner;

class Quesd {

    void sortByLength(String str) {
        String words[] = str.split("\\s+");

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Words sorted by length:");
        for (String w : words) {
            System.out.print(w + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesd obj = new Quesd();

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        obj.sortByLength(str);
    }
}