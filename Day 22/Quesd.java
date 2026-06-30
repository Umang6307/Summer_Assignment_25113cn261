import java.util.Scanner;

class Quesd {

    String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesd obj = new Quesd();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("After removing spaces: " + obj.removeSpaces(str));
    }
}