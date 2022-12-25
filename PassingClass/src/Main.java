import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;

        Scanner put = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz. : ");
        mat = put.nextInt();
        System.out.print("Fizik notunu giriniz. : ");
        fizik = put.nextInt();
        System.out.print("Kimya notunu giriniz. : ");
        kimya = put.nextInt();
        System.out.print("Türkçe notunu giriniz. : ");
        turkce = put.nextInt();
        System.out.print("Müzik notunu giriniz. : ");
        muzik = put.nextInt();

        double avarage = (mat + fizik + kimya + turkce + muzik) / 5;

        if(avarage <= 55){
            System.out.println("Sınıfta kaldınız. Seneye tekrar deneyiniz :) ");
        } else{
            System.out.println("Tebrikler, sınıfı geçtiniz.");
        }
        System.out.println("Not ortalamanız : " + avarage);
    }
}