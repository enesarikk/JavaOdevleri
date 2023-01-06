import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter;
        int max = 0, min = 0;

        System.out.print("The number of numbers you want to enter : ");
        counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print("Number : ");
            int number = scan.nextInt();
            if (i == 1) {
                max = number;
                min = number;
            } else {
                if (number > max) max = number;
                if (number < min) min = number;
            }
        }
        System.out.println("The largest number you enter : " + max);
        System.out.println("The smallest number you enter : " + min);
    }
}