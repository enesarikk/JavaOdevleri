import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start, finish;
        boolean isPrime = true;

        System.out.print("Enter your starting number. : ");
        start = scan.nextInt();
        System.out.print("Enter your end number : ");
        finish = scan.nextInt();

        if (start > 1 && start < finish) {
            for (int i = start; i <= finish; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + ", ");
                }
                isPrime = true;
            }
        } else System.out.println("You entered incorrectly.");
    }
}
