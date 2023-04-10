

public class Main {
    public static void main(String[] args) {

        int yuzler, bırler, onlar;
        System.out.println("Armstrong Sayılar: ");

        for (int i = 100; i <= 999; i++) {
            yuzler = i / 100;
            onlar = (i % 100) / 10;
            bırler = i % 10;

            int toplam = (int) (Math.pow(yuzler, 3) + Math.pow(onlar, 3) + Math.pow(bırler, 3));

            if (i == toplam) {
                System.out.println(i + " ");
            }

        }


    }
}