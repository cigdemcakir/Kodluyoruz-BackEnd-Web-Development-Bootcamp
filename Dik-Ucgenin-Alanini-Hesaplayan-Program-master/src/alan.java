import java.util.Scanner;

public class alan {
    public static void main(String[] args) {
        int a,b,c;
        double cevre,u,alan;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenarın uzunluğunu giriniz:");
        a=input.nextInt();

        System.out.println("2. Kenarın uzunluğunu giriniz:");
        b=input.nextInt();

        System.out.println("3. Kenarın uzunluğunu giriniz:");
        c=input.nextInt();

        cevre=(a+b+c);
        u=(cevre/2);
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));


        System.out.println("Üçgenin alanı:"+ alan);
    }
}
