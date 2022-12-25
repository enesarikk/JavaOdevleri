import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner grs = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz. : ");
        n1 = grs.nextInt();
        System.out.print("İkinci sayıyı giriniz. :");
        n2 = grs.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = grs.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam Sonuç : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkan Sonuç : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım Sonucu : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0){
                System.out.println("Bölüm Sonucu : " + (n1 / n2));
            } else{
                System.out.println("Bir sayı 0'a bölünemez.");
            }
            break;
            default:
                System.out.println("Yapmış olduğunuz işlem geçersiz.");
        }
    }
}