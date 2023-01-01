import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number, total = 0;

        System.out.print("Enter the number : ");
        number = scan.nextInt();

        while (number != 0) {
            total += number %10;
            number /= 10;
        }
        System.out.println("Sum of digits : " + total);
    }
}