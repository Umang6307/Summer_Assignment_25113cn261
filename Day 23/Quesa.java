import java.util.Scanner;

class Quesa {

    char firstNonRepeating(String str) {
        int freq[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '_'; // if none found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesa obj = new Quesa();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = obj.firstNonRepeating(str);

        if (result == '_')
            System.out.println("No non-repeating character found");
        else
            System.out.println("First non-repeating character = " + result);
    }
}