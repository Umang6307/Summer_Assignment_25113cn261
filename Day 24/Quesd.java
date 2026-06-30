import java.util.Scanner;

class Quesd {

    String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean visited[] = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!visited[ch]) {
                sb.append(ch);
                visited[ch] = true;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesd obj = new Quesd();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("After removing duplicates = " 
                + obj.removeDuplicates(str));
    }
}