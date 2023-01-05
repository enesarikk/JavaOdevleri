import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Enter the base number of the triangle to be formed. : ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= (num - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = num; j >= num - i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (num - i - 1) * 2; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}