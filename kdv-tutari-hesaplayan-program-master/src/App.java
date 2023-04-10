import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double x, y, z;

        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz Fiyat: ");
        x = input.nextDouble();

        boolean ifPriceBeBetween0And1000 = x > 0 && x < 1001;

        if (ifPriceBeBetween0And1000) {
            y = (x + (x * 0.08));
            z = (x * 0.18);
            System.out.println("KDV'li Fiyat=" + y);
            System.out.println("KDV Tutarı=" + z);
        }



        if (x > 1000) {
            y = (x + (x * 0.08));
            z = (x * 0.08);
            System.out.println("1000 lira üzeri KDV'li Fiyat: " + y);
            System.out.println("1000 lira üzeri KDV'li Fiyat: " + z);
        }
    }
}
