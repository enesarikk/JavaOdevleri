import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, total = 0, totalNumber = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sınır sayınızı belirtiniz. : ");
        k = scanner.nextInt();

        for (int i = 1; i < k; i++) {
            if (i % 12 == 0) {
                System.out.print(i + ", ");
                total += i;
                totalNumber++;
            }

        }
        System.out.println("");
        System.out.println("Toplanan sayıların ortalaması : " + total/totalNumber);
    }
}