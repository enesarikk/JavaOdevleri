import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double price, rate, KDVrate1=0.18, KDVrate2 = 0.08, KDVprice, KDVwprice;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz : ");
        price = inp.nextDouble();
        rate = (price > 0 && price <= 1000) ? KDVrate1 : KDVrate2;
        KDVprice = price * rate;
        KDVwprice = price + KDVprice;
        System.out.println("KDV'siz fiyatı : " + price);
        System.out.println("KDV oranı : " + rate);
        System.out.println("KDV fiyatı : " + KDVprice);
        System.out.println("KDV'li fiyatı : " + KDVwprice);
    }
}