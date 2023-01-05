import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1, number2, i = 1, EBOB = 1, EKOK = 1;

        System.out.print("Enter the first number. : ");
        number1 = scan.nextInt();
        System.out.print("Enter the second number : ");
        number2 = scan.nextInt();

        while (i < number1 && i < number2) {
            if (number1 % i == 0 && number2 % i == 0) {
                EBOB = i;
            }
            i++;
        }
        System.out.println("EBOB : " + EBOB);

        EKOK = (number1 * number2) / EBOB;
        System.out.println("EKOK : " + EKOK);
    }
}