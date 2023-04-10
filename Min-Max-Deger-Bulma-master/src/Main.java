import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1, maks=0, min=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int n = inp.nextInt();

        while (i <= n) {
            System.out.print(i + ". sayıyı giriniz:");
            int sayi = inp.nextInt();
            if (i == 1) {
                maks = sayi;
                min = sayi;
            }
            if (sayi > maks) {
                maks = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
            i++;
        }
        System.out.println("Girdiğiniz " + n + " adet sayıdan en büyük olanı:" + maks + ", en küçük olanı:" + min);

    }
}