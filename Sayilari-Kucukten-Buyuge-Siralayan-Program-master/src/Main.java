import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.println("1. SAYI:");
        a = inp.nextInt();

        System.out.println("2. SAYI:");
        b = inp.nextInt();

        System.out.println("3. SAYI:");
        c = inp.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a<b<c");
            }
            if (c < b) {
                System.out.println("a<c<b");
            }
        } else if (b < a && b < c){
            if(a<c){
                System.out.println("b<a<c");
            }
            if(c<a){
                System.out.println("b<c<a");
            }
        }else{
            if(a<b){
                System.out.println("c<a<b");
            }
            if(b<a){
                System.out.println("c<b<a");
            }
        }


    }
}