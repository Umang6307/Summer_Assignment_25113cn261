import java.util.Scanner;
import java.util.Arrays;

class Quesc {

    void sortNames(String names[]) {
        Arrays.sort(names);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quesc obj = new Quesc();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String names[] = new String[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        obj.sortNames(names);
    }
}