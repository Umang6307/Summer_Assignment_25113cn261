import java.util.Scanner;

class Quesb {

    int countWords(String str) {
        str = str.trim();

        if (str.isEmpty())
            return 0;

        return str.split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesb obj = new Quesb();

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.println("Total words = " + obj.countWords(str));
    }
}