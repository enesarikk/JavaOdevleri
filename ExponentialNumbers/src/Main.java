import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit number : ");
        x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

    }
}