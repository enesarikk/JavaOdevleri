import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distanceKM, age, type;
        double price, ageDiscount = 1, typeDiscount = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Uçuş mesafesini giriniz. : ");
        distanceKM = scanner.nextInt();

        System.out.print("Yaşınızı giriniz. : ");
        age = scanner.nextInt();

        System.out.print("Yolculuk şekliniz Tek Yön ise 1, Gidiş-Dönüş ise 2 giriniz. : ");
        type = scanner.nextInt();

        price = 0.10 * distanceKM;

        if (age <= 0 || distanceKM <= 0 || (type != 1 && type != 2)) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        if (age < 12){
            ageDiscount = 0.5;
        } else if (age > 12 && age < 24) {
            ageDiscount = 0.9;
        } else if (age > 65) {
            ageDiscount = 0.7;
        }

        if (type == 2) {
            typeDiscount = 1.6;
        }

        System.out.println("İndirimsiz fiyat : " + (type == 2 ? price * 2 : price));
        System.out.println("Toplam fiyat : " + (price * typeDiscount * ageDiscount));
    }
}