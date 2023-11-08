import java.util.Scanner;

public class Main {
    static int primeNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int num = input.nextInt();

        boolean isPrime = true;
        for(int i = 2; i < num;i++){
            if(num % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(num + " Sayısı asaldır.");
        } else {
            System.out.println(num + " Sayısı asal sayı değildir.");
        }
        return primeNumber();
    }
    public static void main(String[] args) {
        System.out.println(primeNumber());
    }
}