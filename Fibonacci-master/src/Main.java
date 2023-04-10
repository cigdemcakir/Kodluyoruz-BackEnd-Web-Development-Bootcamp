import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci Seri'si yazdırmak istiyorsunuz?: ");
        int n = inp.nextInt();

        int birinci = 0;
        int ikinci = 1;
        int ucuncu = birinci + ikinci;

        System.out.println("Fibonacci sayıları");
        System.out.print(birinci + " " + ikinci + " ");
        while (n > 0) {
            System.out.print(ucuncu + " ");
            n--;
            birinci = ikinci;
            ikinci = ucuncu;
            ucuncu = birinci + ikinci;
        }
    }
}