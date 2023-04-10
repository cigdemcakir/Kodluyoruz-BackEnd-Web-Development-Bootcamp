import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        double a,e,d,m,p,top;


        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo:");
        a=input.nextDouble();

        System.out.println("Elma kaç kilo:");
        e=input.nextDouble();

        System.out.println("Domates kaç kilo:");
        d=input.nextDouble();

        System.out.println("Muz kaç kilo:");
        m=input.nextDouble();

        System.out.println("Patlıcan kaç kilo:");
        p=input.nextDouble();

        top=((2.14*a)+(3.67*e)+(1.11*d)+(0.95*m)+(5.00*p));
        System.out.println("Toplam Tutar:"+top);
    }
}
