import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz. : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Size önerim : KAYAK YAPMAK");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Size önerim : SINEMAYA GITMEK");
        }
        if (heat >= 15 && heat <= 25) {
            System.out.println("Size önerim : PIKNIGE GITMEK");
        }
            

        if (heat > 25) {
            System.out.println("Size önerim : YUZMEYE GITMEK");
        }

    }
}
