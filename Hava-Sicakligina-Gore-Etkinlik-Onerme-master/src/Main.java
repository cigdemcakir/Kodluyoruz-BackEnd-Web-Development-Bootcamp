import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz:");
        heat = input.nextInt();

        if(heat>=25){
            System.out.println("Yüzmeye gidebilirsin.");
        }
        else if(heat>=5 && heat<=25){
            if(heat>=15){
                System.out.println("Pikniğe gidebilirsin.");
            }
            else{
                System.out.println("Sinemaya gidebilirsin.");
            }
        }
        else{
            System.out.println("Kayak yapmaya gidebilirsin.");
        }
    }
}