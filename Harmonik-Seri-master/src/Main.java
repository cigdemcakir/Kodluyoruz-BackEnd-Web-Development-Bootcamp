import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double result = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı girin:");
        double sayi = inp.nextDouble();

        do {
            result += (1 / sayi);
            sayi--;
        } while (sayi > 0);

        System.out.println(result);




    }
}