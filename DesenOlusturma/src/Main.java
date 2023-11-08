import java.util.Scanner;

public class Main {
    static void back(int num, int temp){
        if(num > 0){
            System.out.print(num + " ");
            back(num - 5, temp);
    } else if (num <= 0) {
            back1(num, temp);
        }
    }
    static void back1(int num, int temp){
        if( temp >= num){
            System.out.print(num + " ");
            back1(num + 5, temp);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        int temp = num;
        back(num,temp);
    }
}