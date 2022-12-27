import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String zsign = "";
        boolean isError = false;

        Scanner grs = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay : ");
        month = grs.nextInt();
        System.out.print("Doğduğunuz Gün : ");
        day = grs.nextInt();

        if (month == 1) {
            if (day > 0 && day < 32) {
                if (day < 22) {
                    zsign = "Oğlak";
                } else {
                    zsign = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day > 0 && day < 29) {
                if (day < 20) {
                    zsign = "Kova";
                } else {
                    zsign = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day > 0 && day < 32) {
                if (day < 21) {
                    zsign = "Balık";
                } else {
                    zsign = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day > 0 && day < 31) {
                if (day < 21) {
                    zsign = "Koç";
                } else {
                    zsign = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day > 0 && day < 32) {
                if (day < 22) {
                    zsign = "Boğa";
                } else {
                    zsign = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day > 0 && day < 31) {
                if (day < 23) {
                    zsign = "İkizler";
                } else {
                    zsign = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day > 0 && day < 32) {
                if (day < 23) {
                    zsign = "Yengeç";
                } else {
                    zsign = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day > 0 && day < 32) {
                if (day < 23) {
                    zsign = "Aslan";
                } else {
                    zsign = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day > 0 && day < 31) {
                if (day < 23) {
                    zsign = "Başak";
                } else {
                    zsign = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day > 0 && day < 32) {
                if (day < 23) {
                    zsign = "Terazi";
                } else {
                    zsign = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day > 0 && day < 31) {
                if (day < 22) {
                    zsign = "Akrep";
                } else {
                    zsign = "Yay";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day > 0 && day < 32) {
                if (day < 23) {
                    zsign = "Yay";
                } else {
                    zsign = "Oğlak";
                }
            } else {
                isError = true;
            }
            if (isError = true) {
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
            }
        }
        System.out.println("Burcunuz : " + zsign);
    }
}
