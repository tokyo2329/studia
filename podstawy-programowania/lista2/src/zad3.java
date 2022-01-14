import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class zad3 {

    public static Random rand = new Random();

    public static int random_int(int max) {
        return rand.nextInt(max)+1;
    }

    public static void main(String[] args) {

        System.out.println("Wprowadz X i Y");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        TreeMap<Integer, Integer> mapa = new TreeMap<>();

        for(int i = 1; i <= x; ++i) {
            mapa.put(i, 0);
        }

        for(int i = 1; i <= y; ++i) {
            int r = random_int(x);
            if(r > x) continue;
            int wart = mapa.get(r) + 1;
            mapa.put(r, wart);
        }

        for(int i = 1; i <= x; ++i) {
            System.out.println(i + " wystapilo " + mapa.get(i) + " razy");
        }
    }

}
