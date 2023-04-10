import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,a;
        double π=3.14,alan;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapın uzunluğunu giriniz:");
        r=input.nextInt();

        System.out.println("Merkez açısının ölçüsünü giriniz:");
        a=input.nextInt();

        alan=(π*(r*r)*a)/360;

        System.out.println("Dairenin alanı:" + alan);
    }
}