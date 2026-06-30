import java.util.Scanner;

class Quesb {

    String compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 &&
                   str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            sb.append(count);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesb obj = new Quesb();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Compressed string = " + obj.compress(str));
    }
}