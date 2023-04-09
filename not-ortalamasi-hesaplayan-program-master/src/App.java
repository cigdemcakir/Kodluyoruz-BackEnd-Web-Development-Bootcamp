import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

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

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        boolean kosul1 = sonuc > 60;
        String str = (kosul1) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
