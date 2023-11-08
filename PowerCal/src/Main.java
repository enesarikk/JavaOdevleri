import java.util.Scanner;

public class Main {
    static int power(){
        Scanner cal = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int x = cal.nextInt();
        System.out.print("Üst değerini giriniz : ");
        int y = cal.nextInt();
        int result = 1;
        for(int i=1; i<=y;i++){
            result *= x;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sonuç : " + (power()));
    }
}