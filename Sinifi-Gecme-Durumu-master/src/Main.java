import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Matematik Notunuz: ");
            mat = inp.nextInt();

            System.out.print("Fizik Notunuz: ");
            fizik = inp.nextInt();

            System.out.print("Kimya Notunuz: ");
            kimya = inp.nextInt();

            System.out.print("Türkçe Notunuz: ");
            turkce = inp.nextInt();

            System.out.print("Tarih Notunuz: ");
            tarih = inp.nextInt();

            System.out.print("Müzik Notunuz: ");
            muzik = inp.nextInt();
        }

        int toplam = 0;
        int sayac = 0;
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            sayac++;
        }
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            sayac++;
        }
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            sayac++;
        }
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            sayac++;
        }
        if (tarih >= 0 && tarih <= 100) {
            toplam += tarih;
            sayac++;
        }
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            sayac++;
        }
        double ortalama = toplam / sayac;
        if (ortalama <= 55) {
            System.out.println("Sınıfta kaldınız");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız:" + ortalama);
    }
}