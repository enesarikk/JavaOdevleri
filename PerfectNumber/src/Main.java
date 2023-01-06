import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entery = new Scanner(System.in);

        int number, total = 0;
        System.out.print("Enter your number : ");
        number = entery.nextInt();

        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                total += i;
            }
        }
        if (total == (2 * number)){
            System.out.println("The number " + number + " is the perfect number.");
        } else {
            System.out.println("The number " + number + " is not a perfect number.");
        }
    }
}