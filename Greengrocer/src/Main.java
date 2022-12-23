import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00;
        double pearKg, appleKg, tomatoKg,bananaKg,eggplantKg, total;
        Scanner variable = new Scanner(System.in);
        System.out.print("Armutun kilosu : ");
        pearKg = variable.nextDouble();
        System.out.print("Elmanın kilosu : ");
        appleKg = variable.nextDouble();
        System.out.print("Domatesin kilosu : ");
        tomatoKg = variable.nextDouble();
        System.out.print("Muzun kilosu : ");
        bananaKg = variable.nextDouble();
        System.out.print("Patlıcanın kilosu : ");
        eggplantKg = variable.nextDouble();
        total = ((pear*pearKg) +(apple*appleKg) +(tomato*tomatoKg) + (banana*bananaKg) + (eggplant*eggplantKg));
        System.out.print("Ödemeniz gereken tutar : " + total + " TL");
    }
}