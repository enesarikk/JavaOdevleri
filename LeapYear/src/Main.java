import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir YIL Giriniz. : ");
        year = scanner.nextInt();

        if (year %4 == 0 ) {
            if(year %100 == 0){
                if ( year %400 == 0){
                    System.out.println(year + " artık bir yıldır.");
                } else {
                    System.out.println(year + " artık bir yıl değildir.");
                }
            } else {
                System.out.println(year + " artık bir yıldır.");
            }
        } else {
            System.out.println(year + " artık bir yıl değildir.");
        }
    }
}