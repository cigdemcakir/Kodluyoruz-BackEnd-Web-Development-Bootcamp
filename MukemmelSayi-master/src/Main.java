import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toplam = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int n = inp.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n) {
            System.out.println(n + " Mükemmel sayıdır.");
        } else {
            System.out.println(n + " Mükemmel sayı değildir.");
        }
    }
}
