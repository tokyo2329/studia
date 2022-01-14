import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class zad21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> wejscie = new ArrayList<>();

        System.out.println("Podaj 6 liczb");

        for (int i = 0; i < 6; i++) {
            int tmp = sc.nextInt();
            while(tmp > 49 || tmp < 0 || wejscie.contains(tmp)) {
                System.out.println("sprobuj ponownie (bez duplikatow i w zakresie 0 - 49)");
                tmp = sc.nextInt();
            }
            wejscie.add(tmp);
        }

        System.out.println("licze...");
        ArrayList<Integer> komputer = new ArrayList<>();
        for(int i = 0; i < 6; i++) { komputer.add(0); }
        long dni;
        for(dni = 0; !wejscie.equals(komputer); dni++) {
            for(int i = 0; i < 6; i++) {
                komputer.set(i, rand.nextInt(49) + 1);
            }
            if(dni%100000 == 0) System.out.println("dalej licze.. (liczba dni to juz " + dni + ")");
        }
        System.out.println(dni);
    }

}
