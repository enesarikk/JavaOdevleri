import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int step;

        System.out.print("Enter the number of rows of the triangle you want to create. : ");
        step = input.nextInt();
        System.out.println("");
        for (int i = 1; i <= step; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int l = (2 * step) - i; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
