import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 1;

        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı giriniz:");
        int sayi = inp.nextInt();
        System.out.println("Üs giriniz:");
        int us = inp.nextInt();


        for (int i = 1; i <= us; i++) {
            total *= sayi;
        }
        System.out.println(sayi + " üzeri " + us + " = " + total);


    }
}