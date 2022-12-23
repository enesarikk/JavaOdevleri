import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double height, weight, bmi ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Metre cinsinden boyunuzu giriniz. : ");
        height = inp.nextDouble();
        System.out.print("Kilogram cinsinden ağırlığınızı giriniz. : ");
        weight = inp.nextDouble();
        bmi = weight / (height * height);
        System.out.print("Vücut kitle indeksiniz : " + bmi);
    }
}