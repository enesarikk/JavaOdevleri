import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t, u, total = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base number. : ");
        t = scan.nextInt();
        System.out.print("Enter the number of exponents. : ");
        u = scan.nextInt();

        for (int i = 1; i <= u; i++) {
            total *= t;
        }
        System.out.println("Result of mathematical operation : " + total);
    }
}