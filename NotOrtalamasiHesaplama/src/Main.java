import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int math, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        math = inp.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();
        int toplam = (math + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);
        boolean result = sonuc >= 60;
        String str = result ? "Sınıfı Geçti." : "Sınıfta Kaldı.";
        System.out.println(str);
    }
}
