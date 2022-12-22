import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double price, KDVoran = 0.18;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz : ");
        price = inp.nextDouble();
        System.out.println("KDV'li fiyat : " + String.format("%.2f", (price * KDVoran + price)));

    }
}