import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, total = 0;

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Please enter your number : ");
            x = scanner.nextInt();

            if (x % 2 != 0) {
                break;
            }

            if (x % 4 == 0) {
                total += x;
            }
        }

        System.out.println("The sum of the numbers you entered : " + total);
    }
}