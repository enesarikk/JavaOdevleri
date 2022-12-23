import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double price, KDVrate=0.18, KDVprice, KDVwprice;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz :");
        price = inp.nextDouble();
        KDVprice = price * KDVrate;
        KDVwprice = price + KDVprice;
        System.out.println("KDV'siz fiyatı : " + price);
        System.out.println("KDV oranı : " + KDVrate);
        System.out.println("KDV fiyatı : " + KDVprice);
        System.out.println("KDV'li fiyatı : " + KDVwprice);

    }
}