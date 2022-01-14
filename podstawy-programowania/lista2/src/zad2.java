import java.util.HashSet;

public class zad2 {

    public static void main(String[] args) {


        HashSet<Integer> A = new HashSet<Integer>();

        HashSet<Integer> B = new HashSet<Integer>();

        for(int i=0; i<10; ++i)
            A.add(i);

        for(int i=0; i<7; ++i)
            B.add(i);


        int ile_pokrywa = 0;

        for (int num : A) {
            for (int num2 : B) {

                if(num == num2) ile_pokrywa++;

            }
        }

        HashSet<Integer> suma_zbiorow = new HashSet<>();
        for (int num : A) {
            if(!suma_zbiorow.contains(num))
                suma_zbiorow.add(num);
        }
        for (int num : B) {
            if(!suma_zbiorow.contains(num))
                suma_zbiorow.add(num);
        }

        HashSet<Integer> czesc_wspolna = new HashSet<>();
        for (int num : A) {
            for (int num2 : B) {
                if(num == num2 && !czesc_wspolna.contains(num))
                    czesc_wspolna.add(num);
            }
        }

        HashSet<Integer> roznica = new HashSet<>();
        roznica.addAll(A);
        for(int num : B)
            if(roznica.contains(num)) roznica.remove(num);
    }
}
