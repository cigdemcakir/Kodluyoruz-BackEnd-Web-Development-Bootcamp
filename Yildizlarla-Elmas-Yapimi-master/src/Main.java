import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Elmasın yüksekliği kaç satır olsun?:");
        int yukseklik = inp.nextInt();
        int yariYukseklik = (yukseklik / 2) + 1;

        for (int i = 1; i <= yariYukseklik; i++) {
            for (int j = 1; j <= yariYukseklik - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
        for (int i = yariYukseklik - 1; i >= 1; i--) {
            for (int j = 1; j <= yariYukseklik - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }


    }
}




