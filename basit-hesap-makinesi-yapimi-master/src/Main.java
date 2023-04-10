import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,secim;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayıyı Giriniz:");
        a=input.nextInt();
        System.out.println("2. Sayıyı Giriniz:");
        b=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        secim= input.nextInt();

        switch (secim){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if (b==0){
                    System.out.println("Bir sayı 0'a bölünmez");
                }
                else{
                    System.out.println(a/b);
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir değer giriniz");
        }

    }
}