import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int f, c, totalF = 1, totalC = 1, totalFC = 1, result;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements of the set. : ");
        f = scan.nextInt();

        System.out.print("Enter the number of combinations. : ");
        c = scan.nextInt();

        for (int i = 1; i <= f; i++) {
            totalF = totalF * i;
        }
        System.out.println("Factorial reuslt of " + f + " : " + totalF);

        for (int k = 1; k <= c; k++) {
            totalC = totalC * k;
        }

        for (int l = 1; l <= (f - c); l++) {
            totalFC = totalFC * l;
        }
        System.out.println("C(" + f + "," + c + ") : " + (totalF) / ((totalFC * totalC)));
    }
}