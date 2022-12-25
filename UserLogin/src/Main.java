import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName, password,newPassword, isAccept;
        Scanner grs = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz : ");
        userName = grs.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = grs.nextLine();

        if(userName.equals("patika") && password.equals("Java101")){
            System.out.println("Girdiğiniz bilgiler doğrudur.");
        } else {
            System.out.println("Girdiğiniz bilgiler yanlıştır.");
            System.out.print("Şifrenizi sıfırlamak ister misinz ? (Y/N)");
            isAccept = grs.nextLine();
            if (isAccept.equals("Y")) {
                System.out.print("Yeni şifrenizi giriniz : ");
                newPassword = grs.nextLine();
                if (newPassword.equals("Java101")){
                    System.out.print("Yeni şifreniz eskisi ile aynı olamaz.Lütfen yeni şifre belirleyiniz. :");
                    newPassword = grs.nextLine();
                    System.out.println("Şifreniz oluşturuldu.");
                } else {
                    System.out.println("Şifreniz oluşturuldu.");
                }
            }
            }
        System.out.println("Sistemden çıkış yapılıyor.");
        }

}