import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result, previous = 0, next = 1;

        System.out.print("Enter the number of elements of the Fibonacci series. : ");
        int factor = input.nextInt();

        for (int i = 0; i <= factor; i++) {
            System.out.print(previous + " ");
            result = previous + next;
            previous = next;
            next = result;
        }
    }
}