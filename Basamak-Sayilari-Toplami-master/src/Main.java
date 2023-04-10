import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int toplam = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı girin:");
        int sayi = inp.nextInt();

        while (sayi != 0) {
            toplam = (sayi % 10) + toplam;
            sayi /= 10;
        }
        System.out.println("Basamak sayıları toplamı: " + toplam);
    }
}