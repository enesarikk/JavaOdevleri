import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner I = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz. : ");
        n1 = I.nextInt();
        System.out.print("2. sayıyı giriniz. : ");
        n2 = I.nextInt();
        System.out.print("3. sayıyı giriniz. : ");
        n3 = I.nextInt();

        if ((n1 < n2) && (n1 < n3)) {
            if (n2 < n3) {
                String text = String.format("%d < %d < %d", n1, n2, n3);
                System.out.println(text);
            } else {
                String text = String.format("%d < %d < %d", n1, n3, n2);
                System.out.println(text);
            }
        } else if ((n2 < n1) && (n2 < n3)) {
            if (n1 < n3) {
                String text = String.format("%d < %d < %d", n2, n1, n3);
                System.out.println(text);
            } else {
                String text = String.format("%d < %d < %d", n2, n3, n1);
                System.out.println(text);
            }
        } else if ((n3 < n1) && (n3 < n2)) {
            if (n1 < n2) {
                String text = String.format("%d < %d < %d", n3, n1, n2);
                System.out.println(text);
            } else {
                String text = String.format("%d < %d < %d", n3, n2, n1);
                System.out.println(text);
            }
        }
    }
}
