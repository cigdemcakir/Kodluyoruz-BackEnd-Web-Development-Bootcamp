import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int num = arr.length;
        double harmoniktop = 0.0;

        System.out.println("List: " + Arrays.toString(arr));

        for (int j : arr)
            harmoniktop += (1 / (double) j);

        double harmonikort = (double) arr.length / harmoniktop;
        System.out.println("Dizinin harmonik ortalaması: " + harmonikort);
    }
}