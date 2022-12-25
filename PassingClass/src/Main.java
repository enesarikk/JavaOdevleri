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

        double avarage, total = 0;

        if(0 <= mat && mat <=100){
            total = total + mat;
        }
        if(0 <= fizik && fizik <=100){
            total = total + fizik;
        }
        if(0 <= kimya && kimya <=100){
            total = total + kimya;
        }
        if (0 <= turkce && turkce <=100){
            total = total + turkce;
        }
        if (0 <= muzik && muzik <=100){
            total = total + muzik;
        }

        avarage = total / 5;

        if(avarage <= 55){
            System.out.println("Sınıfta kaldınız. Seneye tekrar deneyiniz :) ");
        } else{
            System.out.println("Tebrikler, sınıfı geçtiniz.");
        }
        System.out.println("Not ortalamanız : " + avarage);
    }
}