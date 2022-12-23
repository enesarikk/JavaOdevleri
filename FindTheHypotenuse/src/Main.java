import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //İlk başta değişkenlerimizi oluşturalım.
        int a, b,j,k,l;
        double c,u, perimeter,area;
        //Daha sonra bu değişkenlere değer girmemiz için kütüphaneleri ekleyelim ve kodu yazalım.
        Scanner var = new Scanner(System.in);
        System.out.print("1.Dik kenarı giriniz. : ");
        a = var.nextInt();
        System.out.printf("2.Dik kenarı giriniz. : ");
        b = var.nextInt();
        //Burada karakök'ü almak istediğimiz için yeni bir kütüphane öğrenmiş olduk.
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);
        System.out.print("İlk kenarı giriniz. : ");
        j = var.nextInt();
        System.out.print("İkinci kenarı giriniz. : ");
        k = var.nextInt();
        System.out.print("Üçüncü kenarı giriniz. : ");
        l = var.nextInt();
        perimeter = (j + k + l);
        System.out.println("Kenar uzunluklarını girdiğiniz üçgenin çevresi : " + perimeter);
        u = perimeter / 2;
        area = Math.sqrt( (u) * (u - j) * (u - k) * (u - l) );
        System.out.println("Kenar uzunluklarını verdiğiniz üçgenin alanı : " + area);
    }
}