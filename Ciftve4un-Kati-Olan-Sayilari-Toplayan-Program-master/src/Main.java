import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayac = 0;
        int n;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz:");
            n = inp.nextInt();
            if (n % 2 == 0) {
                if (n % 4 == 0) {
                    sayac += n;
                }
            }
        } while (n % 2 == 0);
        System.out.println("Girilen sayıların toplamı:" + sayac);

    }
}