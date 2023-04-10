import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n = inp.nextInt();

        System.out.println("4'ün kuvvetleri:");

        for (int i = 4; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri:");

        for (int i = 5; i <= n; i *= 5) {
            System.out.println(i);
        }


    }

}
