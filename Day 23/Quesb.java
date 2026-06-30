import java.util.Scanner;

class Quesb {

    char firstRepeating(String str) {
        int freq[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > 1) {
                return str.charAt(i);
            }
        }

        return '_';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesb obj = new Quesb();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = obj.firstRepeating(str);

        if (result == '_')
            System.out.println("No repeating character found");
        else
            System.out.println("First repeating character = " + result);
    }
}