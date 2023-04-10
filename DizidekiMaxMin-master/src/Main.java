import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] List = {44, 32, 11, 7, 16, 4, 92};

        int min = List[0];
        int max = List[0];

        System.out.println("Bir Sayı Giriniz:");
        int n = input.nextInt();

        Arrays.sort(List);
        for (int i : List) {
            if (i < n) {
                min = i;
            }
            if (i > n) {
                max = i;
                break;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
}