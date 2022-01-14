import java.util.Random;
import java.util.Scanner;

public class zad12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj zakres");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int losowa = rand.nextInt(y-x) + x;

        System.out.println("Zgadnij liczbe");
        int strzal = sc.nextInt();
        int ilosc_prob;

        for(ilosc_prob = 1; strzal != losowa; ilosc_prob++) {
            if(strzal > losowa) System.out.println("za duzo");
            else if (strzal < losowa) System.out.println("za malo");

            strzal = sc.nextInt();
        }

        System.out.println("zgadles za " + ilosc_prob + " proba!");

    }

}
