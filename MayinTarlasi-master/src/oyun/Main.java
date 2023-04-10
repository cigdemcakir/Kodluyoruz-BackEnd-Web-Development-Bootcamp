package oyun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int satir, sutun;

        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!");
        System.out.println("Kaça kaçlık alan yaratılsın");
        System.out.print("Satır: ");
        satir = scan.nextInt();
        System.out.print("Sütun: ");
        sutun = scan.nextInt();

        System.out.println("-1->Mayın\t-2->Mayın Yok\t 9->Önceden Ziyaret Edilen Nokta");
        game.Oyun gm = new game.Oyun(satir, sutun);
        gm.start();
    }
}