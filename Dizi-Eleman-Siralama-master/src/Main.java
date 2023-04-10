import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olsun: ");
        int a = inp.nextInt();
        int[] dizi = new int[a];

        System.out.println("Dizinin boyutu: " + a);
        for (int i = 0; i < a; i++) {
            System.out.print((i + 1) + ". elemanı giriniz: ");
            dizi[i] = inp.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
    }
}