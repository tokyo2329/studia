import java.util.Random;

public class zad13 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] losowe = new int[6];

        for(int i = 0; i < losowe.length; ++i) {
            int tmp;
            do {
                tmp = rand.nextInt(49) + 1;
            } while(czy_zawiera(losowe, tmp));
            losowe[i] = tmp;
        }

        for(int n : losowe) System.out.print(n + " ");

    }

    public static Boolean czy_zawiera(int[] tablica, int wartosc) {
        Boolean out = false;
        for(int n : tablica) {
            if(n == wartosc) out = true;
        }
        return out;
    }

}
