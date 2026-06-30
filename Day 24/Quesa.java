import java.util.Scanner;

class Quesa {

    boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        String temp = s1 + s1;
        return temp.contains(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesa obj = new Quesa();

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if (obj.isRotation(s1, s2))
            System.out.println("Strings are rotation of each other");
        else
            System.out.println("Strings are NOT rotation of each other");
    }
}