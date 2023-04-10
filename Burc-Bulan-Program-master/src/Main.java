import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;
        String burc = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç numaralı ayda doğdunuz(1-12):");
        ay = inp.nextInt();

        System.out.println("Doğduğunuz gün(1-31):");
        gun = inp.nextInt();

        if (ay == 1) {
            if (gun <= 21) {
                burc = "oğlak";
            } else {
                burc = "kova";
            }
        }

        if (ay == 2) {
            if (gun <= 19) {
                burc = "kova";
            } else {
                burc = "balık";
            }
        }
        if (ay == 3) {
            if (gun <= 20) {
                burc = "balık";
            } else {
                burc = "koç";
            }
        }
        if (ay == 4) {
            if (gun <= 20) {
                burc = "koç";
            } else {
                burc = "boğa";
            }
        }
        if (ay == 5) {
            if (gun <= 21) {
                burc = "boğa";
            } else {
                burc = "ikizler";
            }
        }
        if (ay == 6) {
            if (gun <= 22) {
                burc = "ikizler";
            } else {
                burc = "yengeç";
            }
        }
        if (ay == 7) {
            if (gun <= 22) {
                burc = "yengeç";
            } else {
                burc = "aslan";
            }
        }
        if (ay == 8) {
            if (gun <= 22) {
                burc = "aslan";
            } else {
                burc = "başak";
            }
        }
        if (ay == 9) {
            if (gun <= 22) {
                burc = "başak";
            } else {
                burc = "terazi";
            }
        }
        if (ay == 10) {
            if (gun <= 22) {
                burc = "terazi";
            } else {
                burc = "akrep";
            }
        }
        if (ay == 11) {
            if (gun <= 21) {
                burc = "akrep";
            } else {
                burc = "yay";
            }
        }
        if (ay == 12) {
            if (gun <= 21) {
                burc = "yay";
            } else {
                burc = "oğlak";
            }
        }

        if (ay <= 1 || ay >= 12){
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        }
        if(ay >= 1 && ay <= 12){
            if(gun <= 1 || gun >= 32){
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
            }
        }
        if(ay >= 1 && ay <= 12){
            if(gun >= 1 && gun <= 32){
                System.out.println("Merhaba, burcunuz:" + burc);
            }
        }
    }
}