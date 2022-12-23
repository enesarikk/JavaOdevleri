import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double r, pi = 3.14, prmtr, area, alfa;
        Scanner radius = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz. : ");
        r = radius.nextDouble();
        System.out.print("Alfa açısını giriniz. :");
        alfa = radius.nextDouble();
        alfa = (pi * r * r * alfa) / 360;
        prmtr = 2 * pi * r;
        area = pi * r * r;
        System.out.println("Dairenin çevresi : " + prmtr);
        System.out.println("Dairenin alanı : " + area);
        System.out.println("Girdiğiniz açının daile dilim alanı : " + alfa);
    }
}