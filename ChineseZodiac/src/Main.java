import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int born, remainder;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz. : ");
        born = scanner.nextInt();

        remainder = born % 12;

        switch (remainder) {
            case 0:
                System.out.println("Çin Zodyağına göre burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağına göre burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağına göre burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağına göre burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağına göre burcunuz : Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağına göre burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağına göre burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağına göre burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağına göre burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağına göre burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağına göre burcunuz : At");
                break;
            case 11:
                System.out.println("Çin Zodyağına göre burcunuz : Koyun");
                break;
        }
    }
}