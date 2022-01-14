import java.util.Random;
import java.util.Scanner;

public class zad14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] wejscie = new int[6];

        System.out.println("Podaj 6 liczb");

        for (int i = 0; i < 6; i++) {
            int tmp = sc.nextInt();
            while(tmp > 49 || tmp < 0 || czy_zawiera(wejscie, tmp)) {
                System.out.println("sprobuj ponownie (bez duplikatow i w zakresie 0 - 49)");
                tmp = sc.nextInt();
            }
            wejscie[i] = tmp;
        }

        System.out.println("licze...");
        int[] komputer = new int[6];
        long dni;
        for(dni = 0; wejscie != komputer; dni++) {
            for(int i = 0; i < 6; i++) {
                komputer[i] = rand.nextInt(49) + 1;
            }
            if(dni%100000 == 0) System.out.println("dalej licze.. (liczba dni to juz " + dni + ")");
        }
        System.out.println(dni);
    }

    public static Boolean czy_zawiera(int[] tablica, int wartosc) {
        Boolean out = false;
        for(int n : tablica) {
            if(n == wartosc) out = true;
        }
        return out;
    }

}
