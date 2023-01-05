import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Username : ");
            userName = scan.nextLine();
            System.out.print("Password : ");
            password = scan.nextLine();

            if (userName.equals("enes2035") && password.equals("vaktilal20.")) {
                System.out.println("Welcome to ARIK ATM");
                do {
                    System.out.println("""
                            1-) Withdraw Money
                            2-) To Deposit Money
                            3-) Show Balance
                            4-) Exit""");
                    System.out.print("Select the operation you want to do. : ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Enter the amount of money you wish to withdraw. : ");
                            int price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient funds.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 2:
                            System.out.print("Enter the amount of money you wish to deposit. : ");
                            price = scan.nextInt();
                            balance += price;
                            break;
                        case 3:
                            System.out.println("Your balance : " + balance);
                            break;
                        default:
                            if (select != 4) System.out.println("You have made an invalid operation.");
                            break;
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Incorrect entry. Your remaining right " + right);
            }
            if (right == 0) {
                System.out.println("Your right has expired. Your account has been blocked.");
            }
        }
    }
}