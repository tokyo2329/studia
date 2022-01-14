import java.util.Random;
import java.util.Scanner;

public class zad11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj zakres");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int losowa = rand.nextInt(y-x) + x;
        System.out.println("twoja losowa liczba to " + losowa);

    }
}
