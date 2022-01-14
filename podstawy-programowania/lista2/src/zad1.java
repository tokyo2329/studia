import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class zad1 {

    public static void main(String[] args) {


        LinkedList<String> lista = new LinkedList<>();

        lista.add("Tomasz"); lista.add("Jakub");
        lista.add("Katarzyna"); lista.add("Kamila");
        lista.add("Artur"); lista.add("Michal");
        lista.add("Sandra"); lista.add("Julita");
        lista.add("Bartosz"); lista.add("Marcel");

        LinkedList<String> first_three = new LinkedList<>();
        for(int i=0;i<3;++i) first_three.add(lista.get(i));

        LinkedList<String> last_three = new LinkedList<>();
        for(int i=1;i<=3;++i) last_three.add(lista.get(lista.size()-i));


        lista.add(5, "Mateusz");

        for(int i=0;i<3;++i) lista.removeFirst();

        for(int i=0;i<3;++i) last_three.removeLast();

        LinkedList<String> nowa_lista = new LinkedList<>();
        nowa_lista.add("Mikolaj"); nowa_lista.add("Kamil");
        nowa_lista.add("Kai"); nowa_lista.add("Mojzesz");
        nowa_lista.add("Sara"); nowa_lista.add("Weronika");

        lista.addAll(nowa_lista);

        ArrayList<String> lista_arr = new ArrayList<>();
        lista_arr.addAll(lista);

        ArrayList<String> lista_arr2 = new ArrayList<>();
        lista_arr2.addAll(nowa_lista);

        Collections.sort(lista_arr);

        Collections.sort(lista_arr2, Collections.reverseOrder());
    }
}
